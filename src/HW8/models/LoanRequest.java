package HW8.models;

import HW8.contracts.Observer;
import HW8.contracts.Subject;

import java.util.ArrayList;
import java.util.List;

public class LoanRequest implements Subject {
    private long number;
    private double amount;
    private List<Observer> observers = new ArrayList<>();

    public LoanRequest(long number, double amount) {
        this.number = number;
        this.amount = amount;
    }

    public long getNumber() {
        return number;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public String notifyObservers(String approver) {
        StringBuilder result = new StringBuilder();
        for (Observer o : observers) {
            result.append(o.update(this, approver));
        }
        return result.toString();
    }

}
