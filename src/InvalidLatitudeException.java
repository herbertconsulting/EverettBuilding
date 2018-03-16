/**
 * Herb Everett
 */
public class InvalidLatitudeException extends Exception {

    @Override
    public String getMessage() {
        return "Invalid Latitude -- please enter a value that is between 34 and 36.";
    }
}
