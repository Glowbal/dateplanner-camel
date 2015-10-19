package nl.han.dateplanner.services.application;

import nl.han.dateplanner.services.application.google.GeoLocationService;
import nl.han.dateplanner.services.application.google.PlacesService;
import nl.han.dateplanner.services.application.openweather.WeatherService;

import java.io.FileNotFoundException;

public class DateFinderFactory {

    public IDateFinderService create() throws FileNotFoundException {
        return new DateFinderService(new PlacesService(), new WeatherService(), new GeoLocationService());
    }

}