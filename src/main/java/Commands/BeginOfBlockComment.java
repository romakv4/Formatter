package Commands;

import com.formatter.IWriter;

import java.io.IOException;

/**
 * Class for begin block of comment.
 */
class BeginOfBlockComment implements ICommand {

    @Override
    public void execute(Context cont) {
        try {
            if (cont.nextChar == '*') {
                cont.wrt.writeChar('\n');
                cont.writeTabs();
            }
            cont.wrt.writeChar(cont.ch);
        } catch (IOException ignored) {

        }
    }
}
