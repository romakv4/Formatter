package Commands;

import com.formatter.IWriter;

import java.io.IOException;

/**
 * class for end block comment.
 */
class EndOfBlockComment implements ICommand{
    @Override
    public void execute(Context cont) {
        try {
            cont.wrt.writeChar(cont.ch);
            if (cont.nextChar == '/') {
                cont.wrt.writeChar('/');
                cont.wrt.writeChar('\n');
                cont.writeTabs();
            }
        } catch (IOException ignored) {

        }
    }
}
