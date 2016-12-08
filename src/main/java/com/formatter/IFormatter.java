package com.formatter;

import reader.IReader;
import writer.IWriter;

/**
 * Interface for formatter.
 */
interface IFormatter {
    /**
     *
     * @param rd for read methods.
     * @param wrt for write methods.
     * @throws FormatterException for format.
     */
    void format(IReader rd, IWriter wrt)
            throws FormatterException;
}
