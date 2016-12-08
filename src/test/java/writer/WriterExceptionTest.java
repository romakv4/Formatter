package writer;

import org.junit.Test;

/**
 * Test for exception of writer.
 */
public class WriterExceptionTest {
    @Test(expected = WriterException.class)
    public void writerException() throws WriterException {
        throw new WriterException("test");
    }
}