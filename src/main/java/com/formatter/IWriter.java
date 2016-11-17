package com.formatter;

import java.io.IOException;

/**
 * Interface for writer.
 */
public interface IWriter {
    /**
     *
     * @param ch for writeChar.
     * @throws IOException for writeChar.
     */
    void writeChar(char ch) throws IOException;

    /**
     * Method for closing file.
     * @throws IOException for close.
     */
    void close() throws IOException;
}
