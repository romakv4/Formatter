package com.formatter;

/**
 * Interface for writer.
 */
public interface IWriter {
    /**
     *
     * @param ch for writeChar.
     * @throws WriterException for writeChar.
     */
    void writeChar(char ch) throws WriterException;

    /**
     * Method for closing file.
     * @throws WriterException for close.
     */
    void close() throws WriterException;
}
