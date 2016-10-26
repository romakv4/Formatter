package com.company;

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
    com.company.Reader read = new com.company.Reader();
        System.out.print(Format.format(read.read()));
    }
}
