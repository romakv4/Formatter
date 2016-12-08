package com.formatter;

import reader.Reader;
import reader.ReaderException;
import writer.Writer;
import writer.WriterException;

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
     * @throws FormatterException for main.
     * @throws ReaderException for main.
     * @throws WriterException for main.
     */
    public static void main(final String[] args)
            throws ReaderException, FormatterException,
                WriterException {
        Formatter formatter = new Formatter();
        Writer wr = new Writer("output");
        Reader re = new Reader("input");
        formatter.format(re, wr);
    }
}
