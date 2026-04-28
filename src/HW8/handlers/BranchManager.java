package HW8.handlers;

import HW8.contracts.RequestHandler;
import HW8.models.LoanRequest;

import java.util.Objects;

public class BranchManager implements RequestHandler {

    private RequestHandler requestHandler;
    @Override
    public void setNextHandler(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    @Override
    public String approve(LoanRequest loanRequest) {
        if(loanRequest.getAmount() < 10000) {
            return loanRequest.notifyObservers("branch manager");
        } else if(Objects.nonNull(requestHandler)) {
            return requestHandler.approve(loanRequest);
        } else {
            return "Request can't be approved";
        }
    }
}
