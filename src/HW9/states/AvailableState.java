package HW9.states;

import HW9.contracts.State;
import HW9.receiver.Book;

public class AvailableState implements State {

    @Override
    public String purchaseBook(Book book) {
        book.decrementQuantity();

        if(book.getAvailableQuantity() == 0) {
            book.setState(new OutOfStockState());
        } else if (book.getAvailableQuantity() <= 5) {
            book.setState(new AwaitingDeliveryState());
        }

        return "Book: " + book.getTitle() + ", ordered. Remaining quantity: " + book.getAvailableQuantity();
    }

    @Override
    public String deliverBook(Book book) {
        book.incrementQuantity();
        return "Book: " + book.getTitle() + ", delivered. Current quantity: " + book.getAvailableQuantity();
    }
}
