package com.formatter;

/**
 * My first exception.
 */
public class WriterException extends Exception {
    /**
     * @param message it's exception throws if buffer is not ready.
     */
    public WriterException(final String message) {
        super(message);
    }
}
