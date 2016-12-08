package reader;

/**
 * Interface for reader.
 */
public interface IReader {
    /**
     *
     * @return true if file not empty.
     * @throws ReaderException for hasChar.
     */
    boolean hasChar() throws ReaderException;

    /**
     *
     * @return buffer with char.
     * @throws ReaderException for readChar.
     */
    char readChar() throws ReaderException;

}
