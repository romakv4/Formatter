package commands;

import writer.WriterException;

/**
 * class for new line.
 */
class NewLine implements ICommand {
    @Override
    public void execute(final Context cont) throws CommandException {
        try {
            cont.wrt.writeChar(cont.ch);
            cont.writeTabs();
        } catch (WriterException e) {
            throw new CommandException(e.getMessage() + "\n"
                    + "Error in NewLine");
        }
    }
}
