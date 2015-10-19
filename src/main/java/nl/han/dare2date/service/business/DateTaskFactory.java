package nl.han.dare2date.service.business;

import nl.han.dare2date.service.application.DateFinderFactory;

import java.io.FileNotFoundException;

public class DateTaskFactory {

    public IDateTaskService create() throws FileNotFoundException {
        DateFinderFactory factory = new DateFinderFactory();

        return new DateTaskService(factory.create());
    }

}
