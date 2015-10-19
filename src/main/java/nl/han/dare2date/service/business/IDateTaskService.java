package nl.han.dare2date.service.business;

import nl.han.dare2date.DateOptions;
import nl.han.dare2date.DatePlannerResponse;

import javax.xml.datatype.DatatypeConfigurationException;
import java.io.IOException;

public interface IDateTaskService {

    /**
     * Get the date options. A date option holds a place with a forecast.
     *
     * @param options The options from the request.
     *
     * @return Return a list of date options.
     *
     * @throws IOException
     * @throws DatatypeConfigurationException
     */
    DatePlannerResponse getDateOption(DateOptions options) throws IOException, DatatypeConfigurationException;

}
