package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Formatter class read from a file to char array.
 */
class Formatter implements IFormatter {
    /**
     *
     * @return returns an array of characters read.
     */
    public char[] read() {
        String filePath = "src//main//resources//text.txt";
        File f = new File(filePath);
        final char[] buffer = new char[(int) f.length()];
        int read = 0;
        try (FileReader reader = new FileReader(f)) {
            read = reader.read(buffer);
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage() + read);
        }
        return buffer;
    }
    /**
     *
     * @param buffer is an array in which the text file is considered.
     * @return returns a formatted text.
     */
    public String format(final char[] buffer) {
        StringBuilder sb = new StringBuilder();
        int level = 0;
        for (char i: buffer) {
            if (i == '{') {
                level++;
                sb.append(i).append("\n");
                for (int j = 0; j < level; j++) {
                    sb.append("\t");
                }
            } else if (i == ';') {
                sb.append(i).append("\n");
                for (int j = 0; j < level; j++) {
                    sb.append("\t");
                }

            } else if (i == '}') {
                sb.deleteCharAt(sb.length() - 1);
                sb.append(i).append("\n");
                level--;
                for (int j = 0; j < level; j++) {
                    sb.append("\t");
                }
            } else {
                sb.append(i);
            }
        }
        return sb.toString();
    }

    void writer() {
        Formatter formatter = new Formatter() { };
        FileWriter fw = null;
        try {
            fw = new FileWriter("formattedText");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            assert fw != null;
            fw.write(formatter.format(formatter.read()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
