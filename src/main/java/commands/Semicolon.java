package commands;

import writer.WriterException;

/**
 * class for semicolon.
 */
class Semicolon implements ICommand {
    @Override
    public void execute(final Context cont) throws CommandException {
        try {
            cont.wrt.writeChar(cont.ch);
            if (cont.nextChar != '/') {
                cont.wrt.writeChar('\n');
                for (int j = 0; j < cont.level; j++) {
                    cont.wrt.writeChar('\t');
                }
            }
        } catch (WriterException e) {
            throw new CommandException(e.getMessage() + "\n"
                    + "Error in Semicolon");
        }
    }
}
