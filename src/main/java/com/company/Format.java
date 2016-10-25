package com.company;

/**
 * Created by roman on 21.10.16.
 */
public class Format {
    public static String format(char[] buffer){
        StringBuilder sb = new StringBuilder();
        int level = 0;
        for (int i = 0; i < buffer.length; i++) {
            if(buffer[i] == '{'){
                level++;
                sb.append(buffer[i] + "\n");
                for (int j = 0; j < level; j++) {
                    sb.append("\t");
                }

            }
            else if(buffer[i] == ';'){
                sb.append(buffer[i] + "\n");
                for (int j = 0; j < level; j++) {
                    sb.append("\t");
                }

            }
            else if (buffer[i] == '}'){
                sb.deleteCharAt(sb.length()-1);
                sb.append(buffer[i] + "\n");
                level--;
                for (int j = 0; j < level; j++) {
                    sb.append("\t");
                }
            }
            else{
                sb.append(buffer[i]);
            }
        }
        return sb.toString();
    }
}
