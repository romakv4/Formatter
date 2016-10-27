package com.company;

/**
 *
 */
final class Format {
    /**
     * This is a private constructor to eliminate errors.
     */
    private Format() { }
    /**
     *
     * @param buffer is an array in which the text file is considered.
     * @return returns a formatted text.
     */
    static String format(final char[] buffer) {
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
}
