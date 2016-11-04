package com.formatter;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Tests for formatter.
 */
public class FormatterTest {
    @Test
    public void read() throws Exception {
        String controlData = "public{{{asdasdasdasd;adsdgfdgsdffsf;safdgfdbsfdsfvfsggd;}}}";
        Reader reader = new Reader();
        Assert.assertEquals(controlData, new String(reader.read()));
    }

    @Test
    public void format() throws Exception {
        String controlData = "public{\n\t{\n\t\t{\n\t\t\t" +
                "asdasdasdasd;\n\t\t\tadsdgfdgsdffsf;\n\t\t\t" +
                "safdgfdbsfdsfvfsggd;\n\t\t}\n\t}\n}\n";
        Formatter form = new Formatter();
        Reader reader = new Reader();
        System.out.println(controlData);
        Assert.assertEquals(controlData, form.format(reader.read()));
    }

    @Test
    public void writer() {
        String controlData = "public{\n\t{\n\t\t{\n\t\t\t" +
                "asdasdasdasd;\n\t\t\tadsdgfdgsdffsf;\n\t\t\t" +
                "safdgfdbsfdsfvfsggd;\n\t\t}\n\t}\n}\n";

        File f=new File("formattedText");
        try(FileReader reader = new FileReader(f))
        {
            char[] buffer = new char[(int)f.length()];
            reader.read(buffer);
            Assert.assertEquals(controlData, new String(buffer));
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}