package com.formatter;

import Commands.Context;
import Commands.Map;
import java.io.IOException;

/**
 * Formatter class read from a file to char array.
 */
class Formatter implements IFormatter {
    /**
     * @param rd  for read methods.
     * @param wrt for write methods.
     * @throws IOException for format.
     * @throws ReaderException for format.
     */
    public void format(final IReader rd, final IWriter wrt)
            throws FormatterException, IOException, ReaderException {

        Context cont = new Context(wrt);
        Map m = new Map();
        cont.ch = rd.readChar();
        while (rd.hasChar()) {
            cont.nextChar = rd.readChar();
            m.get(cont.ch).execute(cont);
            cont.ch = cont.nextChar;
        }
        wrt.close();
    }
}
