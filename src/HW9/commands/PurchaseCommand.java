package HW9.commands;

import HW9.contracts.Command;
import HW9.receiver.Book;

public class PurchaseCommand implements Command {

    private Book book;

    public PurchaseCommand(Book book) {
        this.book = book;
    }
    @Override
    public String execute() {
        return book.purchaseBook();
    }
}
