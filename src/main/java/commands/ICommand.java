package commands;

/**
 * Interface for commands.
 */
public interface ICommand {

    /**
     *
     * @param cont for program context.
     * @throws CommandException error for execute method.
     */
    void execute(final Context cont) throws CommandException;
}
