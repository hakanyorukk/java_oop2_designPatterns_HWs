package HW10.contracts;

import HW10.models.RegularPassenger;
import HW10.models.VipPassenger;

public interface DocumentVisitor {

    String check(RegularPassenger passenger);
    String check(VipPassenger passenger);
}
