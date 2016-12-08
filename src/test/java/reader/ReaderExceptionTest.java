package reader;

import org.junit.Test;

/**
 * Test for exception of reader.
 */
public class ReaderExceptionTest {
    @Test(expected = ReaderException.class)
    public void readerException() throws ReaderException {
        throw new ReaderException("test");
    }
}