package com.formatter;

import java.io.IOException;

/**
 * Interface for reader.
 */
interface IReader {
    /**
     * @throws IOException for read method.
     * @return text from file.
     */
    char[] read() throws IOException;
}
