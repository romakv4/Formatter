package com.formatter;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Class for read method.
 */
class Reader implements IReader {
    /**
     * THIS IS BUFFER!
     */
    private BufferedReader buffer;
    /**
     *
     * @param file for name of file.
     * @throws FileNotFoundException for Reader class.
     */
    Reader(final String file) throws FileNotFoundException {
        buffer = new BufferedReader(new FileReader(file));
    }

    /**
     *
     * @return buffer ready or no.
     * @throws IOException for hasChar.
     */
    public boolean hasChar() throws IOException {
        return buffer.ready();
    }

    /**
     *
     * @return chars.
     * @throws IOException for readChar.
     */
    public char readChar() throws IOException {
        return (char) buffer.read();
    }
}
