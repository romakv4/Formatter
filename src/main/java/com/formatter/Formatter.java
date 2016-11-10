package com.formatter;

import java.io.IOException;

/**
 * Formatter class read from a file to char array.
 */
class Formatter implements IFormatter {
    /**
     * @param rd  for read methods.
     * @param wrt for write methods.
     * @throws IOException for format.
     */
    public void format(final IReader rd, final IWriter wrt) throws IOException {
        char ch;
        int level = 0;
        while (rd.hasChar()) {
            String currentString = safeRead(rd);
            for (int i = 0; i < currentString.length(); i++) {
                ch = currentString.charAt(i);
                if (ch == '{') {
                    level++;
                    wrt.writeChar(ch);
                    wrt.writeChar('\n');
                    for (int j = 0; j < level; j++) {
                        wrt.writeChar('\t');
                    }
                } else if (ch == '*') {
                    wrt.writeChar(ch);
                    if (currentString.charAt(i + 1) == '/') {
                        wrt.writeChar('/');
                        wrt.writeChar('\n');
                        for (int j = 0; j < level; j++) {
                            wrt.writeChar('\t');
                        }
                        break;
                    }
                } else if (ch == ';') {
                    if (currentString.charAt(i + 1) == '/') {
                        if (currentString.charAt(i + 2) == '*') {
                            wrt.writeChar(ch);
                            wrt.writeChar('\n');
                            for (int j = 0; j < level; j++) {
                                wrt.writeChar('\t');
                            }
                            wrt.writeChar('/');
                            wrt.writeChar('*');
                            i++;
                            break;
                        }
                        wrt.writeChar(ch);
                        wrt.writeChar('/');
                        wrt.writeChar('/');
                        break;
                    }
                    wrt.writeChar(ch);
                    wrt.writeChar('\n');
                    for (int j = 0; j < level; j++) {
                        wrt.writeChar('\t');
                    }
                } else if (ch == '\n') {
                    wrt.writeChar(ch);
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
        }
        wrt.close();
    }

    /**
     * @param rd for chars.
     * @return string.
     * @throws IOException for safeRead.
     */
    String safeRead(final IReader rd) throws IOException {
        StringBuilder buffer = new StringBuilder();
        char nextChar = 0;
        while (rd.hasChar()) {
            nextChar = rd.readChar();
            if (nextChar != '}' && nextChar != '/' && nextChar != ' '
                    && nextChar != '\\' && nextChar != '"'
                    && nextChar != '\t' && nextChar != '\n'
                    && nextChar != ')' && nextChar != '*' && nextChar != ';') {
                break;
            }
            buffer.append(nextChar);
        }
        buffer.append(nextChar);
        return buffer.toString().replaceAll(" +", " ");
    }
}
