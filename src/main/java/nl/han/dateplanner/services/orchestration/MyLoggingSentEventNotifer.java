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
    }

    public boolean isEnabled(EventObject event) {
        // we only want the sent events
        return event instanceof ExchangeSentEvent;
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
