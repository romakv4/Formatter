package com.formatter;

import java.io.IOException;

/**
 * Interface for formatter.
 */
interface IFormatter {
    /**
     *
     * @param rd for read methods.
     * @param wrt for write methods.
     * @throws IOException for format.
     */
    void format(IReader rd, IWriter wrt) throws IOException, ReaderException;
}
