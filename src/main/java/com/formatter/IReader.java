package com.formatter;

import java.io.IOException;

/**
 * Interface for reader.
 */
interface IReader {
    /**
     *
     * @return true if file not empty.
     * @throws IOException for hasChar.
     * @throws ReaderException for hasChar.
     */
    boolean hasChar() throws IOException, ReaderException;

    /**
     *
     * @return buffer with char.
     * @throws IOException for readChar.
     */
    char readChar() throws IOException;

}
