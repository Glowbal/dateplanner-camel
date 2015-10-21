package nl.han.dateplanner.services.orchestration;

import org.apache.camel.management.event.ExchangeCompletedEvent;
import org.apache.camel.management.event.ExchangeCreatedEvent;
import org.apache.camel.management.event.ExchangeSentEvent;
import org.apache.camel.support.EventNotifierSupport;

import java.util.EventObject;

public class MyLoggingSentEventNotifer extends EventNotifierSupport {

    @Override
    public void notify(EventObject event) throws Exception {

        if (event instanceof ExchangeSentEvent) {
            ExchangeSentEvent sent = (ExchangeSentEvent) event;
            //log.info("Took " + sent.getTimeTaken() + " millis to send to: " + sent.getEndpoint());
            System.out.println("Took " + sent.getTimeTaken() + " millis to send to: " + sent.getEndpoint() + "\n");
        }
        if (event instanceof ExchangeCompletedEvent) {
            ExchangeCompletedEvent sent = (ExchangeCompletedEvent) event;

            System.out.println("" + sent.getExchange().getIn().getBody());
        }

        if (event instanceof ExchangeCreatedEvent) {
            ExchangeCreatedEvent sent = (ExchangeCreatedEvent) event;

            System.out.println("" + sent.getSource().toString());
        }

        System.out.println("notify has been called " + event.getClass().getName());

    }

    public boolean isEnabled(EventObject event) {
        // we only want the sent events
        return true; // event instanceof ExchangeSentEvent;
    }

    @Override
    protected void doStart() throws Exception {
        // noop
    }

    @Override
    protected void doStop() throws Exception {
        // noop
    }

}
