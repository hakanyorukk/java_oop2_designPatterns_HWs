package HW10.models;

import HW10.contracts.CheckPointMediator;
import HW10.contracts.DocumentVisitor;

public abstract class Passenger {
    private String name;
    private String documentNumber;

    private CheckPointMediator checkPointMediator;

    public Passenger(String name, String documentNumber, CheckPointMediator mediator) {
        this.name = name;
        this.documentNumber = documentNumber;
        this.checkPointMediator = mediator;
    }

    public String requestCheck() {
        return checkPointMediator.checkTicket(this);
    }

    public String getName() {
        return name;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public abstract String accept(DocumentVisitor checker);

}
