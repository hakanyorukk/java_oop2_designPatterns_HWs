package HW8.handlers;

import HW8.contracts.RequestHandler;
import HW8.models.LoanRequest;

import java.util.Objects;

public class RegionalDirector implements RequestHandler {

    private RequestHandler handler;
    @Override
    public void setNextHandler(RequestHandler requestHandler) {
        this.handler = requestHandler;
    }

    @Override
    public String approve(LoanRequest loanRequest) {
        if(loanRequest.getAmount() >= 10000) {
            return loanRequest.notifyObservers("regional director");        } else if(Objects.nonNull(handler)) {
            return handler.approve(loanRequest);
        } else {
            return "Request can't be approved";
        }
    }
}
