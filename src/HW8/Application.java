package HW8;

import HW8.client.Bank;
import HW8.models.LoanRequest;
import HW8.observers.Client;

public class Application {
    public static void main(String[] args) {
        Client client1 = new Client("Yomer Hakan");
        Client client2 = new Client("Hakan");
        Client client3 = new Client("Yomer");

        LoanRequest r1 = new LoanRequest(123, 109.9);
        LoanRequest r2 = new LoanRequest(124, 1001.1);
        LoanRequest r3 = new LoanRequest(125, 10001.01);

        r1.addObserver(client1);
        r2.addObserver(client2);
        r3.addObserver(client3);

        Bank bank = new Bank();
        bank.addRequest(r1);
        bank.addRequest(r2);
        bank.addRequest(r3);

        System.out.println(bank.processLoans());
    }
}
