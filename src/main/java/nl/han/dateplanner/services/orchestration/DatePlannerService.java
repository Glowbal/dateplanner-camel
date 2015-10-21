/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nl.han.dateplanner.services.orchestration;

import nl.han.dateplanner.DatePlannerRequest;
import nl.han.dateplanner.DatePlannerResponse;
import nl.han.dateplanner.services.business.DateTaskFactory;
import nl.han.dateplanner.services.business.IDateTaskService;
import org.apache.camel.*;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.spi.EventNotifier;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

/**
 * When you run this route, messages can be obtained from two sources:
 * - inbox-folder (located in the bin-directory of your Tomcat/Jetty instance (don't run this example with mvn tomcat:run,
 * instead use a separate server. In src/main/webapp/WEB-INF/applyregistrationservice an example messages is included which
 * you can copy to your inbox folder in case your webservice is not available.
 * - a webservice with its wsdl served at http://localhost:8080/Dare2DateCamel/applyregistration.wsdl
 * (otherwise: http://localhost:8080/applyregistration.wsdl)
 */
public class DatePlannerService extends RouteBuilder {

    private final IDateTaskService dateTaskService;

    @Autowired
    public DatePlannerService(IDateTaskService dateTaskService) {
        this.dateTaskService = dateTaskService;
    }

    @Override
    public void configure() throws Exception {
        System.out.println(dateTaskService.toString());

//        JaxbDataFormat jaxb = new JaxbDataFormat(DatePlannerResponse.class.getPackage().getName());
//
//        from("spring-ws:rootqname:{http://www.han.nl/schemas/dateplanner}DatePlannerRequest?endpointMapping=#datePlannerEndpointMapping")
//            .setExchangePattern(ExchangePattern.InOnly)
//                .to("activemq:FOO.BAR")
//            .setExchangePattern(ExchangePattern.InOut).end()
//
//                .unmarshal(jaxb)
//                .log(LoggingLevel.DEBUG, "nl.han.dateplanner", "Processing ${body}")
//                .process(new Echo())
//                .process(new JSONParser())
//            .marshal(jaxb)
//                .setExchangePattern(ExchangePattern.InOnly)
//                .to("activemq:FOO.BAR.BLA")
//                .setExchangePattern(ExchangePattern.InOut).end();
//
//        // Use camel event notifications
//        CamelContext context = getContext();
//        context.getManagementStrategy().addEventNotifier(new MyLoggingSentEventNotifer());
//        for (EventNotifier eventNotifier : context.getManagementStrategy().getEventNotifiers()) {
//            eventNotifier.setIgnoreExchangeSentEvents(false);
//            eventNotifier.setIgnoreExchangeCreatedEvent(false);
//        }
    }

    private static final class Echo implements Processor {
        @Override
        public void process(Exchange exchange) throws Exception {
            DatePlannerRequest request = exchange.getIn().getBody(DatePlannerRequest.class);
            IDateTaskService task = new DateTaskFactory().create();
            exchange.getOut().setBody(task.getDateOption(request.getInput()));
        }
    }

    private static final class JSONParser implements Processor {
        @Override
        public void process(Exchange exchange) throws Exception {
            DatePlannerResponse datePlannerResponse = exchange.getIn().getBody(DatePlannerResponse.class);

            BufferedWriter logger = new BufferedWriter(new OutputStreamWriter(System.out));

            logger.write("Number of places: " + datePlannerResponse.getPlaces().size());
            logger.close();
        }
    }
}
