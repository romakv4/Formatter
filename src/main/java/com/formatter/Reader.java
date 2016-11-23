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
     * @throws ReaderException for Reader class.
     */
    Reader(final String file) throws ReaderException {
        try {
            buffer = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            throw new ReaderException("File did not read");
        }
    }

    /**
     *
     * @return buffer ready or no.
     * @throws ReaderException hasChar.
     */
    public boolean hasChar() throws ReaderException {
        try {
            return buffer.ready();
        } catch (IOException e) {
            throw new ReaderException("Buffer is not ready!");
        }
    }

    /**
     *
     * @return chars.
     * @throws ReaderException for readChar.
     */
    public char readChar() throws ReaderException {
        try {
            return (char) buffer.read();
        } catch (IOException e) {
            throw new ReaderException("Character did not read");
        }
    }
}
