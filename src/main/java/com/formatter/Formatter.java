package com.formatter;

import java.io.IOException;

/**
 * Formatter class read from a file to char array.
 */
class Formatter implements IFormatter {
    /**
     *
     * @param rd for read methods.
     * @param wrt for write methods.
     * @throws IOException for format.
     */
    public void format(final IReader rd, final IWriter wrt) throws IOException {
        char ch;
        int level = 0;
        String array = "";
        while (rd.hasChar()) {
            ch = rd.readChar();

            if (ch == '{') {
                level++;
                wrt.writeChar(ch);
                wrt.writeChar('\n');
                for (int j = 0; j < level; j++) {
                    wrt.writeChar('\t');
                }
            } else if (ch == ';') {
                String s0 = array + String.valueOf(ch);
                System.out.println(s0);

                wrt.writeChar(ch);
                wrt.writeChar('\n');
                for (int j = 0; j < level; j++) {
                    wrt.writeChar('\t');
                }
            } else if (ch == '}') {
                wrt.writeChar(ch);
                wrt.writeChar('\n');
                level--;
                for (int j = 0; j < level; j++) {
                    wrt.writeChar('\t');
                }
            } else {
                wrt.writeChar(ch);
            }
        }
        wrt.close();
    }
}
