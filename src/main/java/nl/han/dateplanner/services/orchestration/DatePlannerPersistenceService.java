package nl.han.dateplanner.services.orchestration;

import nl.han.dateplanner.DatePlannerResponse;
import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.LoggingLevel;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;

public class DatePlannerPersistenceService extends RouteBuilder {

    public DatePlannerPersistenceService() {

    }

    @Override
    public void configure() throws Exception {
        JaxbDataFormat jaxb = new JaxbDataFormat(DatePlannerResponse.class.getPackage().getName());

        System.out.println("CONFIGURE ROUTE DatePlannerPersistenceService");
        from("activemq:datePlannerMessages")
            .unmarshal(jaxb)
                .process(new HandleNewMessage())
            .marshal(jaxb)
            .setExchangePattern(ExchangePattern.InOnly)
                .log(LoggingLevel.DEBUG, "nl.han.dateplanner.DatePlannerPersistenceService", "Processing ${body}")
                .to("file:C:\\camel_route_storage")
            .end();
    }


    private static final class HandleNewMessage implements Processor {
        @Override
        public void process(Exchange exchange) throws Exception {
            DatePlannerResponse datePlannerResponse = exchange.getIn().getBody(DatePlannerResponse.class);
            System.out.println("datePlannerResults process: " + datePlannerResponse.getRequest().getLocation());
        }
    }

}
