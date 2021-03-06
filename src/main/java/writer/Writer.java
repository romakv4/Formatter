package writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Class writer.
 */
public class Writer implements IWriter {
    /**
     * THIS IS BUFFER!
     */
    private BufferedWriter buffer;
    /**
     *
     * @param file for writer.
     * @throws WriterException for Writer class.
     */
    public Writer(final String file) throws WriterException {
        try {
            buffer = new BufferedWriter(new FileWriter(file));
        } catch (IOException e) {
            throw new WriterException("File did not write");
        }
    }

    /**
     *
     * @param ch for writeChar.
     * @throws WriterException for writeChar.
     */
    public final void writeChar(final char ch) throws WriterException {
        try {
            buffer.append(ch);
        } catch (IOException e) {
            throw new WriterException("Characters did not write");
        }
    }

    /**
     *
     * @throws WriterException for close.
     */
    public final void close() throws WriterException {
        try {
            buffer.close();
        } catch (IOException e) {
            throw new WriterException("Buffer can not be "
                    + "closed by close function");
        }
    }
}
