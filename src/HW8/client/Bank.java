package HW8.client;

import HW8.handlers.BranchManager;
import HW8.handlers.CreditConsultant;
import HW8.handlers.RegionalDirector;
import HW8.models.LoanRequest;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private CreditConsultant creditConsultant = new CreditConsultant();
    private BranchManager branchManager = new BranchManager();
    private RegionalDirector regionalDirector = new RegionalDirector();

    private List<LoanRequest> pending = new ArrayList<>();

    public Bank() {
        creditConsultant.setNextHandler(branchManager);
        branchManager.setNextHandler(regionalDirector);
    }

    public void addRequest(LoanRequest request) {
        pending.add(request);
    }

    public String processLoans() {
        StringBuilder result = new StringBuilder();
        for(LoanRequest request : pending) {
            result.append(creditConsultant.approve(request)).append("\n");
        }
        return result.toString();
    }
}
