package HW10.mediator;

import HW10.contracts.CheckPointMediator;
import HW10.contracts.DocumentVisitor;
import HW10.models.Passenger;

import java.util.ArrayList;
import java.util.List;

public class CheckPoint implements CheckPointMediator {

    private List<Passenger> passengers = new ArrayList<>();
    private List<DocumentVisitor> checks = new ArrayList<>();

    public void addCheck(DocumentVisitor check) {
        checks.add(check);
    }

    @Override
    public String checkTicket(Passenger passenger) {
       StringBuilder result = new StringBuilder();
       for(DocumentVisitor check : checks) {
           result.append(passenger.accept(check)).append("\n");
       }
       return result.toString();
    }

    @Override
    public void addUser(Passenger passenger) {
        if(!passengers.contains(passenger)) {
            passengers.add(passenger);
        }
    }
}
