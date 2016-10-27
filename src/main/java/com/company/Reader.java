package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Reader class read from a file to char array.
 */
class Reader {
    /**
     *
     * @return returns an array of characters read.
     */
    char[] read() {
        String filePath = "src//main//resources//";
        String fileName = "text.txt";
        File f = new File(filePath + fileName);
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
}
