package nl.han.dateplanner.services.orchestration;

import nl.han.dateplanner.services.business.TestDateTaskService;
import org.apache.activemq.broker.BrokerService;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.BeforeClass;
import org.junit.Test;

public class ActiveMQTest extends CamelTestSupport {

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new DatePlannerService(new TestDateTaskService());
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        BrokerService brokerSvc = new BrokerService();
        brokerSvc.setBrokerName("TestBroker");
        brokerSvc.addConnector("tcp://localhost:61616");
        brokerSvc.start();
    }

    @Test
    public void testActiveMQ() throws Exception {
        template.sendBody("activemq:FOO.BAR", "HelloWorld!");
        Thread.sleep(3000);
    }

}
