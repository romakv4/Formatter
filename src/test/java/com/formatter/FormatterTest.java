package com.company;

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
        Formatter form = new Formatter();
        Assert.assertEquals(controlData, new String(form.read()));

    }

    @Test
    public void format() throws Exception {
        String controlData = "public{\n\t{\n\t\t{\n\t\t\t" +
                "asdasdasdasd;\n\t\t\tadsdgfdgsdffsf;\n\t\t\t" +
                "safdgfdbsfdsfvfsggd;\n\t\t}\n\t}\n}\n";
        Formatter form = new Formatter();
        System.out.println(controlData);
        Assert.assertEquals(controlData, form.format(form.read()));
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