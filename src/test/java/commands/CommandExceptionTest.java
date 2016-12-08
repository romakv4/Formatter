package commands;

import org.junit.Test;

/**
 * Test for exception of commands.
 */
public class CommandExceptionTest {
    @Test(expected = CommandException.class)
    public void commandException() throws CommandException {
        throw new CommandException("test");
    }
}