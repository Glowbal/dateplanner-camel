package nl.han.dateplanner.services.orchestration;

import nl.han.dateplanner.services.business.DateTaskFactory;

import java.io.FileNotFoundException;

public class DatePlannerFactory {

    public DatePlannerService create() throws FileNotFoundException {
        DateTaskFactory factory = new DateTaskFactory();
        return new DatePlannerService(factory.create());
    }
}
