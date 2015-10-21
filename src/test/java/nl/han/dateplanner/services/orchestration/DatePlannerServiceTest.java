package nl.han.dateplanner.services.orchestration;

import org.apache.camel.EndpointInject;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

public class DatePlannerServiceTest extends CamelTestSupport {

    @EndpointInject(uri = "mock:result")
    protected MockEndpoint resultEndPoint;

    @Produce(uri = "spring-ws:rootqname:{http://www.han.nl/schemas/dateplanner}DatePlannerRequest?endpointMapping=#datePlannerEndpointMapping")
    protected ProducerTemplate template;

    @Test
    public void testRoute() throws Exception {
        String expectedBody = "<matched />";

        resultEndPoint.expectedBodiesReceived(expectedBody);

        template.sendBodyAndHeader(expectedBody, "foo", "bar");

        resultEndPoint.assertIsSatisfied();
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            public void configure() {
                from("spring-ws:rootqname:{http://www.han.nl/schemas/dateplanner}DatePlannerRequest?endpointMapping=#datePlannerEndpointMapping").filter(header("foo").isEqualTo("bar")).to("mock:result");
            }
        };
    }

}
