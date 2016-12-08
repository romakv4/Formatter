package com.formatter;

import org.junit.Test;

/**
 * Test for exception of formatter.
 */
public class FormatterExceptionTest {
    @Test(expected = FormatterException.class)
    public void formatterException() throws FormatterException {
        throw new FormatterException("test");
    }
}