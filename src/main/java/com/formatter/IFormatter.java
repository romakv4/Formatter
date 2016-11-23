package com.formatter;

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
