package Commands;

import com.formatter.IWriter;

import java.io.IOException;

/**
 * All context of program.
 */
public class Context {
    public char ch;
    public char nextChar;
    int level = 0;
    IWriter wrt;

    public Context(IWriter wrt) {
        this.wrt = wrt;
    }

    void writeTabs() throws IOException {
        for (int j = 0; j < level; j++) {
            wrt.writeChar('\t');
        }
    }
}
