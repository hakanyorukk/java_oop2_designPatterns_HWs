package HW7;

import HW7.composite.Document;
import HW7.composite.Paragraph;
import HW7.flyweight.DocumentRepository;

public class Application {
    public static void main(String[] args) {
        DocumentRepository repository = new DocumentRepository();

        Paragraph firstParagraph = new Paragraph();
        firstParagraph.addSymbol(DocumentRepository.getSymbol('H'));
        firstParagraph.addSymbol(DocumentRepository.getSymbol('e'));
        firstParagraph.addSymbol(DocumentRepository.getSymbol('l'));
        firstParagraph.addSymbol(DocumentRepository.getSymbol('l'));
        firstParagraph.addSymbol(DocumentRepository.getSymbol('o'));
        firstParagraph.addSymbol(DocumentRepository.getSymbol('1'));
        firstParagraph.addSymbol(DocumentRepository.getSymbol('1'));
        firstParagraph.addSymbol(DocumentRepository.getSymbol('1'));

        Document document = new Document();
        document.addParagraph(firstParagraph);

        System.out.println(document.visualize());
        System.out.println("Unique symbols in repository: " + repository.getRepositorySize());
    }
}
