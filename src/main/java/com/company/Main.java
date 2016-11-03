package com.company;

import java.io.IOException;

/**
 * Main class.
 */
final class Main {
    /**
     *
     * @param args is unused.
     * This is a main method. It is works.
     */
    public static void main(final String[] args) throws IOException {
        Formatter formatter = new Formatter();
        formatter.read();
        formatter.format(formatter.read());
        formatter.writer();
    }
}
