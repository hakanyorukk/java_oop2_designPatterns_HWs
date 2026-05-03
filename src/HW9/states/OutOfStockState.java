package HW9.states;

import HW9.contracts.State;
import HW9.receiver.Book;

public class OutOfStockState implements State {

    @Override
    public String purchaseBook(Book book) {
        return "Cannot purchase " + book.getTitle() + " is out of stock.";
    }

    @Override
    public String deliverBook(Book book) {
        book.incrementQuantity();
        if(book.getAvailableQuantity() > 0) {
            book.setState(new AwaitingDeliveryState());
        }
        return "Book: " + book.getTitle() + ", delivered current quantity: " + book.getAvailableQuantity() ;
    }
}
