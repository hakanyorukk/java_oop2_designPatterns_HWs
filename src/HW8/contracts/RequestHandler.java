package HW8.contracts;

import HW8.models.LoanRequest;

public interface RequestHandler {

    void setNextHandler(RequestHandler requestHandler);

    String approve(LoanRequest loanRequest);
}
