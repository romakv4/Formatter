package com.company;

/**
 * Interface for reader.
 */
interface IFormatter {
    char[] read();
    String format(final char[] buffer);
}
