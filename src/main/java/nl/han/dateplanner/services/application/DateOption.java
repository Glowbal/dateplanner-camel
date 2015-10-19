package nl.han.dateplanner.services.application;

import nl.han.dateplanner.services.application.google.Place;
import nl.han.dateplanner.services.application.openweather.Forecast;

import java.util.ArrayList;
import java.util.List;

public class DateOption {

    public Place place;

    public List<Forecast> forecast = new ArrayList<>();

}
