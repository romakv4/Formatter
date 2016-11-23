package commands;

import java.util.HashMap;

/**
 * Map of conditions.
 */
public class Map {

    /**
     * It's a hash map!!!
     */
    private HashMap<Character, ICommand> conditions;

    /**
     *
     * @param key Character keys.
     * @return null.
     */
    public final ICommand get(final Character key) {
        if (conditions.containsKey(key)) {
            return conditions.get(key);
        }
        return conditions.get(null);
    }

    /**
     * Map constructor.
     */
    public Map() {
        conditions = new HashMap<>();
        conditions.put('{', new OpenBrace());
        conditions.put('}', new CloseBrace());
        conditions.put(';', new Semicolon());
        conditions.put('\n', new NewLine());
        conditions.put('/', new BeginOfBlockComment());
        conditions.put('*', new EndOfBlockComment());
        conditions.put(null, new OtherChars());
    }
}
