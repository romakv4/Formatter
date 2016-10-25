package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by roman on 19.10.16.
 */
public class Reader {
    String filePath = "src//main//resources//";
    String fileName = "text.txt";
        public char[] read(){
            File f=new File(filePath+fileName);
            char[] buffer = new char[(int)f.length()];
            try(FileReader reader = new FileReader(f))
            {
                reader.read(buffer);
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            }
            return buffer;
    }
}
