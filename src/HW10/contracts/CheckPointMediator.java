package HW10.contracts;

import HW10.models.Passenger;

public interface CheckPointMediator {

    String checkTicket( Passenger passenger);
    void addUser(Passenger passenger);
}
