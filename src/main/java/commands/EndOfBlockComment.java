package commands;

import com.formatter.WriterException;

/**
 * class for end block comment.
 */
class EndOfBlockComment implements ICommand {
    @Override
    public void execute(final Context cont) throws CommandException {
        try {
            cont.wrt.writeChar(cont.ch);
            if (cont.nextChar == '/') {
                cont.wrt.writeChar('/');
                cont.wrt.writeChar('\n');
                cont.writeTabs();
            }
        } catch (WriterException e) {
            throw new CommandException(e.getMessage() + "\n"
                    + "Error in EndOfBlockComment");
        }
    }
}
