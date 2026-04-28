package HW8.contracts;

import HW8.models.LoanRequest;

public interface Observer {
    String update(LoanRequest request, String approver);

}
