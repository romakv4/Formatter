package reader;

/**
 * My first exception.
 */
public class ReaderException extends Exception {
    /**
     * @param message it's exception throws if buffer is not ready.
     */
    ReaderException(final String message) {
        super(message);
    }
}
