/**
 * Herb Everett
 */
public class InvalidLongitudeException extends Exception {
    @Override
    public String getMessage() {
        return "Invalid Longitude -- please enter a value that is between -78 and -80.";
    }

}
