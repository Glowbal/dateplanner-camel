package nl.han.dare2date.service.application.google;

public class TestGeoLocationService implements IGeoLocationService {

    private GeoLocation returnValue = null;

    @Override
    public GeoLocation getLocation(String locationName) {
        return returnValue;
    }

    public void SetReturnValue(GeoLocation location) {
        returnValue = location;
    }
}
