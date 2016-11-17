package Commands;

import java.io.IOException;

/**
 * Interface for commands.
 */
public interface ICommand {
    void execute(Context cont) throws IOException;
}
