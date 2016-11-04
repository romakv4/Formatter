package com.formatter;

import java.io.IOException;

/**
 * Main class.
 */
public class Main {
    /**
     * @throws IOException for main method.
     * @param args is unused.
     * This is a main method. It is works.
     */
    public static void main(final String[] args) throws IOException {
        Formatter formatter = new Formatter();
        Reader reader = new Reader();
        Writer writer = new Writer();
        reader.read();
        formatter.format(reader.read());
        writer.writer();
    }
}
