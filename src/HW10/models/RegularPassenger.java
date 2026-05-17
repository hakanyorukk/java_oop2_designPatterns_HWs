package HW10.models;

import HW10.contracts.CheckPointMediator;
import HW10.contracts.DocumentVisitor;


public class RegularPassenger extends Passenger{
    public RegularPassenger(String name, String documentNumber, CheckPointMediator mediator) {
        super(name, documentNumber, mediator);
    }

    @Override
    public String accept(DocumentVisitor checker) {
        return checker.check(this);
    }
}
