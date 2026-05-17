package HW10;

import HW10.contracts.DocumentVisitor;
import HW10.mediator.CheckPoint;
import HW10.models.Passenger;
import HW10.models.RegularPassenger;
import HW10.models.VipPassenger;
import HW10.visitors.DocumentChecker;

public class Application {

    public static void main(String[] args) {
        CheckPoint checkPoint = new CheckPoint();
        DocumentVisitor check = new DocumentChecker();

        Passenger regularPassenger1 = new RegularPassenger("Yomer", "23221012", checkPoint);
        Passenger vipPassenger1 = new VipPassenger("Hakan", "23221012", "2026", checkPoint);

        checkPoint.addUser(regularPassenger1);
        checkPoint.addUser(vipPassenger1);
        checkPoint.addCheck(check);

        System.out.println(checkPoint.checkTicket(regularPassenger1));
        System.out.println(checkPoint.checkTicket(vipPassenger1));
        System.out.println(regularPassenger1.requestCheck());
        System.out.println(vipPassenger1.requestCheck());
    }
}
