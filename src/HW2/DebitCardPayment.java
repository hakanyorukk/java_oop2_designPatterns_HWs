package HW2;

public class DebitCardPayment implements PaymentMethod{
    @Override
    public void pay(Payment payment) {
        System.out.println("Debit card payment " + payment.getAmount() + " " + payment.getCurrency() + " to: " + payment.getReceiver());
    }
}
