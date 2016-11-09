package com.formatter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Class writer.
 */
class Writer implements IWriter {
    /**
     * THIS IS BUFFER!
     */
    private BufferedWriter buffer;
    /**
     *
     * @param file for writer.
     * @throws IOException for Writer class.
     */
    Writer(final String file) throws IOException {
        buffer = new BufferedWriter(new FileWriter(file));
    }

    /**
     *
     * @param ch for writeChar.
     * @throws IOException for writeChar.
     */
    public void writeChar(final char ch) throws IOException {
        buffer.append(ch);
    }

    /**
     *
     * @throws IOException for close.
     */
    public void close() throws IOException {
        buffer.close();
    }
}
