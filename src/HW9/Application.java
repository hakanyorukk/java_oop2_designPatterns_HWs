package HW9;

import HW9.commands.DeliverCommand;
import HW9.commands.PurchaseCommand;
import HW9.invoker.BookProcessor;
import HW9.receiver.Book;

public class Application {
    public static void main(String[] args) {
        Book firstBook = new Book("Example 1 book", 12);
        Book secondBook = new Book("Example 2 book", 5);
        Book thirdBook = new Book("Example 3 book", 1);

        BookProcessor processor = new BookProcessor();
        processor.addCommand(new PurchaseCommand(firstBook));
        processor.addCommand(new DeliverCommand(firstBook));

        processor.addCommand(new PurchaseCommand(secondBook));
        processor.addCommand(new DeliverCommand(secondBook));

        processor.addCommand(new PurchaseCommand(thirdBook));
        processor.addCommand(new DeliverCommand(thirdBook));
        processor.addCommand(new PurchaseCommand(thirdBook));

        System.out.println(processor.process());
    }
}
