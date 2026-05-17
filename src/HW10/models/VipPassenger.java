package HW10.models;

import HW10.contracts.CheckPointMediator;
import HW10.contracts.DocumentVisitor;

public class VipPassenger extends Passenger{
    private String vipNumber;

    public VipPassenger(String name, String documentNumber, String vipNumber, CheckPointMediator mediator) {
        super(name, documentNumber, mediator);
        this.vipNumber = vipNumber;
    }

    public String getVipNumber() {
        return vipNumber;
    }

    @Override
    public String accept(DocumentVisitor checker) {
        return checker.check(this );
    }
}
