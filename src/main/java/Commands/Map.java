package Commands;

import java.util.HashMap;

/**
 * Map of conditions.
 */
public class Map {
    private HashMap<Character, ICommand> conditions;

    public ICommand get(Character key) {
        return conditions.containsKey(key) ? conditions.get(key): conditions.get(null);
    }

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
