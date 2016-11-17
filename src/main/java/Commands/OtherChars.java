package Commands;

import java.io.IOException;

/**
 * class for other chars.
 */
class OtherChars implements ICommand {

    @Override
    public void execute(Context cont) throws IOException {
        cont.wrt.writeChar(cont.ch);
    }
}
