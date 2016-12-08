package commands;

import writer.WriterException;

/**
 * class for open braces.
 */
class OpenBrace implements ICommand {
    @Override
    public void execute(final Context cont) throws CommandException {
        try {
            cont.level++;
            cont.wrt.writeChar(cont.ch);
            cont.wrt.writeChar('\n');
            cont.writeTabs();
        } catch (WriterException e) {
            throw new CommandException(e.getMessage() + "\n"
                    + "Error in OpenBrace");
        }
    }
}
