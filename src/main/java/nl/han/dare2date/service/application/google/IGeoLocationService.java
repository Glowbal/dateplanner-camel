package nl.han.dare2date.service.application.google;

public interface IGeoLocationService {

    /**
     * Find the coordinates for a location by name.
     * @param locationName A location name, for example: New York
     * @return Coordinates
     */
    GeoLocation getLocation(String locationName);

}
