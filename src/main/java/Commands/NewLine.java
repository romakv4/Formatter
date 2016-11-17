package Commands;

import com.formatter.IWriter;

import java.io.IOException;

/**
 * class for new line.
 */
class NewLine implements ICommand{
    @Override
    public void execute(Context cont) {
        try {
            cont.wrt.writeChar(cont.ch);
            cont.writeTabs();
        } catch (IOException ignored) {

        }
    }
}
