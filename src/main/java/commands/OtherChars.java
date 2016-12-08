package commands;

import writer.WriterException;

/**
 * class for other chars.
 */
class OtherChars implements ICommand {

    @Override
    public void execute(final Context cont) throws CommandException {
        try {
            cont.wrt.writeChar(cont.ch);
        } catch (WriterException e) {
            throw new CommandException(e.getMessage() + "\n"
                    + "Error in OtherChars");
        }
    }
}
