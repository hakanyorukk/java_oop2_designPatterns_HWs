package HW9.contracts;

import HW9.receiver.Book;

public interface State {
    String purchaseBook(Book book);
    String deliverBook(Book book);

}
