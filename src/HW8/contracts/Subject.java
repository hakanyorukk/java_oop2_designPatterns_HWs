package HW8.contracts;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    String notifyObservers(String approver);
}
