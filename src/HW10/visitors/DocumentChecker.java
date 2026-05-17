package HW10.visitors;

import HW10.contracts.DocumentVisitor;
import HW10.models.RegularPassenger;
import HW10.models.VipPassenger;

public class DocumentChecker implements DocumentVisitor {
    @Override
    public String check(RegularPassenger passenger) {
        return "Ticket checked; Regular Passenger: " + passenger.getName() + " , Document: " + passenger.getDocumentNumber();
    }

    @Override
    public String check(VipPassenger passenger) {
        return "Ticket checked; Vip Passenger: " + passenger.getName() + ", Document: " + passenger.getDocumentNumber() + ", Vip number: " + passenger.getVipNumber();
    }
}
