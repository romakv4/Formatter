package commands;

import com.formatter.WriterException;

/**
 * Class for close braces.
 */
class CloseBrace implements ICommand {
    @Override
    public void execute(final Context cont) throws CommandException {
        try {
            cont.wrt.writeChar(cont.ch);
            cont.wrt.writeChar('\n');
            cont.level--;
            cont.writeTabs();
        } catch (WriterException e) {
            throw new CommandException(e.getMessage() + "\n"
                    + "Error in CloseBrace");
        }
    }
}
