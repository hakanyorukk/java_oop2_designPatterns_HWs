package HW9.states;

import HW9.contracts.State;
import HW9.receiver.Book;

public class AwaitingDeliveryState implements State {

    @Override
    public String purchaseBook(Book book) {
        book.decrementQuantity();

        if(book.getAvailableQuantity() == 0) {
            book.setState(new OutOfStockState());
        }
        return "Book: " + book.getTitle() + ", ordered. Awaiting for delivery. Remaining quantity: " + book.getAvailableQuantity();
    }

    @Override
    public String deliverBook(Book book) {
        book.incrementQuantity();

        if(book.getAvailableQuantity() > 5) {
            book.setState(new AvailableState());
        }
        return "Book: " + book.getTitle() + ", delivered current quantity: " + book.getAvailableQuantity() ;
    }
}
