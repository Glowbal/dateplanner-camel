package nl.han.dateplanner.services.business;

import nl.han.dateplanner.services.application.DateFinderFactory;

import java.io.FileNotFoundException;

public class DateTaskFactory {

    public IDateTaskService create() throws FileNotFoundException {
        DateFinderFactory factory = new DateFinderFactory();

        return new DateTaskService(factory.create());
    }

}
