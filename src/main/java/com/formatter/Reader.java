package com.formatter;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Class for read method.
 */
class Reader implements IReader {
    /**
     * @throws IOException for read() method.
     * @return returns an array of characters read.
     */
    public char[] read() throws IOException {
        String filePath = "src//main//resources//text.txt";
        File f = new File(filePath);
        final char[] buffer = new char[(int) f.length()];
        FileReader reader = new FileReader(f);
        reader.read(buffer);
        return buffer;
    }
}
