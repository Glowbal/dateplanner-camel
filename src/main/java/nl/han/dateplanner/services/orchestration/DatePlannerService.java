package nl.han.dateplanner.services.orchestration;

import nl.han.dateplanner.DatePlannerRequest;
import nl.han.dateplanner.DatePlannerResponse;
import nl.han.dateplanner.services.business.IDateTaskService;
import org.apache.camel.*;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.spi.EventNotifier;

public class DatePlannerService extends RouteBuilder {

    IDateTaskService taskService;

    public DatePlannerService(IDateTaskService taskService) {
        this.taskService = taskService;
    }

    @Override
    public void configure() throws Exception {
        JaxbDataFormat jaxb = new JaxbDataFormat(DatePlannerResponse.class.getPackage().getName());

        from("spring-ws:rootqname:{http://www.han.nl/schemas/dateplanner}DatePlannerRequest?endpointMapping=#datePlannerEndpointMapping")
            .setExchangePattern(ExchangePattern.InOnly)
                .to("activemq:datePlannerRequests")
            .setExchangePattern(ExchangePattern.InOut).end()

            .unmarshal(jaxb)
                .log(LoggingLevel.DEBUG, "nl.han.dateplanner", "Processing ${body}")
                .process(new ProcessRequest(taskService))
            .marshal(jaxb)
                .setExchangePattern(ExchangePattern.InOnly)
                    .to("activemq:datePlannerMessages")
                .setExchangePattern(ExchangePattern.InOut)
            .end();

        // Use camel event notifications
        CamelContext context = getContext();
        context.getManagementStrategy().addEventNotifier(new MyLoggingSentEventNotifer());
        for (EventNotifier eventNotifier : context.getManagementStrategy().getEventNotifiers()) {
            eventNotifier.setIgnoreExchangeSentEvents(false);
            eventNotifier.setIgnoreExchangeCreatedEvent(false);
        }
    }

    private static final class ProcessRequest implements Processor {

        private IDateTaskService service;

        public ProcessRequest(IDateTaskService service) {
            this.service = service;
        }

        @Override
        public void process(Exchange exchange) throws Exception {
            DatePlannerRequest request = exchange.getIn().getBody(DatePlannerRequest.class);

            DatePlannerResponse response = service.getDateOption(request.getInput());
            response.setRequest(request.getInput());

            exchange.getIn().setBody(response);
        }
    }
}
