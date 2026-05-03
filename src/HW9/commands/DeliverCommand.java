package HW9.commands;

import HW9.contracts.Command;
import HW9.receiver.Book;

public class DeliverCommand implements Command {

    private Book book;

    public DeliverCommand(Book book) {
        this.book = book;
    }
    @Override
    public String execute() {
        return book.deliverBook();
    }
}
