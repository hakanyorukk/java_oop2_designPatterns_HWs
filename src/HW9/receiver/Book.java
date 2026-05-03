package HW9.receiver;

import HW9.contracts.State;
import HW9.states.AvailableState;
import HW9.states.AwaitingDeliveryState;
import HW9.states.OutOfStockState;

public class Book {
    private State state;
    private String title;
    private int availableQuantity;

    public Book(String title, int stock) {
        this.title = title;
        this.availableQuantity = stock;
        if(availableQuantity == 0) state = new OutOfStockState();
        else if(availableQuantity <= 5)  state = new AwaitingDeliveryState();
        else state = new AvailableState();
    }

    public State getState() {
        return state;
    }

    public String getTitle() {
        return title;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String purchaseBook() {
        return state.purchaseBook(this);
    }

    public String deliverBook() {
       return state.deliverBook(this);
    }

    public void decrementQuantity() {
        availableQuantity--;
    }

    public void incrementQuantity() {
        availableQuantity++;
    }


}
