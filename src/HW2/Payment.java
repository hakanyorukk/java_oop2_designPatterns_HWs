package HW2;

public class Payment {

    private double amount;
    private String currency;
    private String sender;
    private String receiver;

    public Payment(double amount, String currency, String sender, String receiver) {
        this.amount = amount;
        this.currency = currency;
        this.sender = sender;
        this.receiver = receiver;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }
}