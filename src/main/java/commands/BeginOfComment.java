package commands;

import com.formatter.WriterException;

/**
 * Class for begin block of comment.
 */
class BeginOfComment implements ICommand {

    /**
     *
     * @param cont for context of program.
     * @throws CommandException for beginOfBlockComment.
     */
    @Override
    public void execute(final Context cont) throws CommandException {
        try {
            if (cont.nextChar == '*') {
                cont.wrt.writeChar('\n');
                cont.writeTabs();
            }
            cont.wrt.writeChar(cont.ch);
        } catch (WriterException e) {
            throw new CommandException(e.getMessage() + "\n"
                    + "Error in BeginOfComment");
        }
    }
}
