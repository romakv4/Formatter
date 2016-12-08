package com.formatter;

import org.junit.Before;
import org.junit.Test;
import reader.Reader;
import reader.ReaderException;
import writer.Writer;
import writer.WriterException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * Test for formatter.
 */
public class FormatterTest {
    private Formatter f;
    private Reader r;
    private Writer w;

    @Before
    public void setUp() throws IOException, ReaderException, WriterException {
        f = new Formatter();
        r = new Reader("input");
        w = new Writer("output");
    }
    @Test
    public void format() throws Exception {
        f.format(r, w);
        BufferedReader controlData = new BufferedReader(new FileReader("template"));
        BufferedReader result = new BufferedReader(new FileReader("output"));
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        while (controlData.ready()) {
            s1.append(controlData.read());
        }
        while (result.ready()) {
            s2.append(result.read());
        }
        assertEquals(s1.toString(), s2.toString());
    }

}