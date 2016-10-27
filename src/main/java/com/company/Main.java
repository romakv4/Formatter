package com.company;

import java.io.File;
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
    com.company.Reader read = new com.company.Reader();
        FileWriter fw = new FileWriter("formattedText");
        fw.write(Format.format(read.read()));
        fw.flush();
    }
}
