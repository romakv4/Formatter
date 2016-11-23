package commands;

import com.formatter.IWriter;
import com.formatter.WriterException;

/**
 * All context of program.
 */
public class Context {
    public char ch;
    public char nextChar;
    int level = 0;
    IWriter wrt;

    public Context(final IWriter wr) {
        this.wrt = wr;
    }

    /**
     *
     * @throws WriterException for writeTabs.
     */
    final void writeTabs() throws WriterException {
        for (int j = 0; j < level; j++) {
                wrt.writeChar('\t');
        }
    }
}
