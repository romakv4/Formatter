package com.company;

import java.io.IOException;

/**
 * Interface for formatter.
 */
interface IFormatter {
    /**
     * @return text from file.
     */
    char[] read() throws IOException;
    /**
     *
     * @param buffer - array for text.
     * @return return formatted text.
     */
    String format(char[] buffer);
}
