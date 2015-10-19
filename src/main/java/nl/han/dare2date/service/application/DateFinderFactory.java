package nl.han.dare2date.service.application;

import nl.han.dare2date.service.application.google.GeoLocationService;
import nl.han.dare2date.service.application.google.PlacesService;
import nl.han.dare2date.service.application.openweather.WeatherService;

import java.io.FileNotFoundException;

public class DateFinderFactory {

    public IDateFinderService create() throws FileNotFoundException {
        return new DateFinderService(new PlacesService(), new WeatherService(), new GeoLocationService());
    }

}