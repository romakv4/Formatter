package com.formatter;

import java.io.IOException;

/**
 * Main class.
 */
final class Main {
    /**
     * constructor for eliminate errors.
     */
    private Main() { }
    /**
     *
     * @param args is not used.
     * @throws IOException for main.
     * @throws ReaderException for main.
     */
    public static void main(final String[] args)
            throws IOException, ReaderException, FormatterException {
        Formatter formatter = new Formatter();
        Writer wr = new Writer("output");
        Reader re = new Reader("input");
        formatter.format(re, wr);
    }
}
