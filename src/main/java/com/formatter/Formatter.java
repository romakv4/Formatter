package com.formatter;

import commands.CommandException;
import commands.Context;
import commands.Map;

/**
 * Formatter class read from a file to char array.
 */
class Formatter implements IFormatter {
    /**
     * @param rd  for read methods.
     * @param wrt for write methods.
     * @throws FormatterException for format.
     */
    public void format(final IReader rd, final IWriter wrt)
            throws FormatterException {

        Context cont = new Context(wrt);
        Map m = new Map();
        try {
            cont.ch = rd.readChar();
            while (rd.hasChar()) {
                cont.nextChar = rd.readChar();
                m.get(cont.ch).execute(cont);
                cont.ch = cont.nextChar;
            }
            wrt.close();
        } catch (ReaderException | WriterException | CommandException e) {
            throw new FormatterException(e.getMessage());
        }
    }
}
