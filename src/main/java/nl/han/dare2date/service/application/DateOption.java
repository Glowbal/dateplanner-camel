package nl.han.dare2date.service.application;

import nl.han.dare2date.service.application.google.Place;
import nl.han.dare2date.service.application.openweather.Forecast;

import java.util.ArrayList;
import java.util.List;

public class DateOption {

    public Place place;

    public List<Forecast> forecast = new ArrayList<>();

}
