package HW7.flyweight;

import HW7.models.Digit;
import HW7.models.LatinLetter;
import HW7.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class DocumentRepository {

    private static Map<Character, Symbol> symbols = new HashMap<>();

    public static Symbol getSymbol(char c) {
        Symbol symbol = symbols.get(c);
        if (symbol == null) {
            symbol = Character.isDigit(c) ? new Digit(c) : new LatinLetter(c);
            symbols.put(c, symbol);
        }
        return symbol;
    }

    public int getRepositorySize() {
        return symbols.size();
    }
}
