package Commands;

import com.formatter.IWriter;

import java.io.IOException;

/**
 * class for semicolon.
 */
class Semicolon implements ICommand {
    @Override
    public void execute(Context cont) {
        try {
            cont.wrt.writeChar(';');
            if (cont.nextChar != '/') {
                cont.wrt.writeChar('\n');
                for (int j = 0; j < cont.level; j++) {
                    cont.wrt.writeChar('\t');
                }
            }
        } catch (IOException ignored) {

        }
    }
}