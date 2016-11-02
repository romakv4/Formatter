package com.company;

/**
 * Interface for formatter.
 */
interface IFormatter {
    /**
     *
     * @return text from file.
     */
    char[] read();
    /**
     *
     * @param buffer - array for text.
     * @return return formatted text.
     */
    String format(char[] buffer);
}
