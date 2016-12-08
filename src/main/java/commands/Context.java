package commands;

import writer.IWriter;
import writer.WriterException;

/**
 * All context of program.
 */
public class Context {
    /**
     * ch for current char.
     */
    public char ch;
    /**
     * Next char.
     */
    public char nextChar;
    /**
     * Level of brackets tabs.
     */
    int level = 0;
    /**
     * wrt for IWriter.
     */
    IWriter wrt;

    /**
     *
     * @param wr it is writer.
     */
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
