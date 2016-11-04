package com.formatter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Class writer.
 */
class Writer extends Reader implements IWriter {

    /**
     * This method writes the code in the file.
     * @throws IOException for writer().
     */
    public void writer() throws IOException {
        Formatter formatter = new Formatter() { };
        Reader reader = new Reader();
        FileWriter fw = new FileWriter("formattedText");
        fw.write(formatter.format(reader.read()));
        fw.flush();

    }
}
