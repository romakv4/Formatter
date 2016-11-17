package Commands;

import com.formatter.IWriter;

import java.io.IOException;

/**
 * class for open braces.
 */
class OpenBrace implements ICommand {
    @Override
    public void execute(Context cont) {
        try {
            cont.level++;
            cont.wrt.writeChar(cont.ch);
            cont.wrt.writeChar('\n');
            cont.writeTabs();
        } catch (IOException ignored) {

        }
    }
}
