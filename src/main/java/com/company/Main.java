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
    public static void main(final String[] args) {
        Formatter formatter = new Formatter() { };
        FileWriter fw = null;
        try {
            fw = new FileWriter("formattedText");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            assert fw != null;
            fw.write(formatter.format(formatter.read()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
