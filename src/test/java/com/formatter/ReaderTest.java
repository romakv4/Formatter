package com.formatter;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import static org.junit.Assert.assertEquals;

/**
 * Tests for reader.
 */
public class ReaderTest {
    private BufferedReader r2;
    private Reader r;

    @Before
    public void setUp() throws FileNotFoundException, ReaderException {
        r = new Reader("input");
        r2 = new BufferedReader(new FileReader("input"));
    }

    @Test
    public void hasChar() throws Exception {
        assertEquals(true, r.hasChar());
    }

    @Test
    public void readChar() throws Exception {
        assertEquals(r.readChar(), (char) r2.read());
    }
}