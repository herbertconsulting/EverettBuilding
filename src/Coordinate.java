/**
 * Herb Everett
 */
public class Coordinate {

    private double latitude;

    private double longitude;

    public Coordinate(double latitude, double longitude) throws InvalidLatitudeException, InvalidLongitudeException {
        try {
            setLatitude(latitude);
        } catch (InvalidLatitudeException e) {
            throw e;
        }
        try {
            setLongitude(longitude);
        } catch (InvalidLongitudeException e) {
            throw e;
        }
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) throws InvalidLatitudeException{

        if (latitude >= 34.0 && latitude <= 36.0) {                                // set "false" to parameters provide by instructor
            this.latitude = latitude;
        } else {
            throw new InvalidLatitudeException();
        }
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) throws InvalidLongitudeException {

        if (longitude <= -78.0 && longitude >= -80.0) {                                // set "false" to parameters provide by instructor
            this.longitude = longitude;
        } else {
            throw new InvalidLongitudeException();
        }
    }

    @Override
    public String toString() {
        return "  Latitude: " + latitude + "\n" +
                "  Longitude: " + longitude;
    }
}
