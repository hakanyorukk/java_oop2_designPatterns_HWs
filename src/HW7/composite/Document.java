package HW7.composite;

import HW7.contracts.TextDocument;

import java.util.ArrayList;
import java.util.List;

public class Document implements TextDocument {

    private List<Paragraph> paragraphs = new ArrayList<>();

    public void addParagraph(Paragraph paragraph) {
        paragraphs.add(paragraph);
    }

    @Override
    public String visualize() {
        StringBuilder result = new StringBuilder();
        for (Paragraph p : paragraphs) {
            result.append(p.visualize()).append("\n");
        }
        return result.toString();
    }
}
