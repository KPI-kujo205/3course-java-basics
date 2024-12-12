package Lab5.modules;

/**
 * Exception thrown when an invalid operation is performed in the taxi park.
 */
public class InvalidCarException extends Exception {
    public InvalidCarException(String message) {
        super(message);
    }
}

