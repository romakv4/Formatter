package commands;

/**
 * My first exception.
 */
public class CommandException extends Exception {
    /**
     * @param message it's exception throws if buffer is not ready.
     */
    CommandException(final String message) {
        super(message);
    }
}
