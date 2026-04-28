package HW8.observers;

import HW8.contracts.Observer;
import HW8.models.LoanRequest;

public class Client implements Observer {

    private String fullName;

    public Client(String fullName) { this.fullName = fullName; }

    public String getFullName() { return fullName; }

    @Override
    public String update(LoanRequest request, String approver) {
        return "Request approved by " + approver +
                ", request number: " + request.getNumber() +
                ", amount: " + request.getAmount() +
                ", client: " + fullName;
    }
}
