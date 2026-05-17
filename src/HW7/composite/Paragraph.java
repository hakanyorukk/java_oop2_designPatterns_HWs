package HW7.composite;

import HW7.contracts.TextDocument;
import HW7.models.Symbol;

import java.util.ArrayList;
import java.util.List;

public class Paragraph implements TextDocument {

    private List<Symbol> symbols = new ArrayList<>();

    public void addSymbol(Symbol symbol) {
        symbols.add(symbol);
    }

    @Override
    public String visualize() {
        StringBuilder result = new StringBuilder();
        for (Symbol s : symbols) {
            result.append(s.visualize());
        }
        return result.toString();
    }
}
