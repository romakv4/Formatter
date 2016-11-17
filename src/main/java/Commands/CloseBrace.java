package Commands;

import com.formatter.IWriter;

import java.io.IOException;

/**
 * Class for close braces.
 */
class CloseBrace implements ICommand {
    @Override
    public void execute(Context cont) {
        try {
            cont.wrt.writeChar(cont.ch);
            cont.wrt.writeChar('\n');
            cont.level--;
            cont.writeTabs();
        } catch (IOException ignored) {

        }
    }
}
