package com.company;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Main class.
 */
final class Main {
    /**
     * private constructor to eliminate errors.
     */
    private Main() { }
    /**
     *
     * @param args is unused.
     * This is a main method. It is works.
     */
    public static void main(final String[] args) throws IOException {
        Formatter read = new Formatter() {};
        FileWriter fw = new FileWriter("formattedText");
        fw.write(Formatter.format(read.read()));
        fw.flush();
    }
}
