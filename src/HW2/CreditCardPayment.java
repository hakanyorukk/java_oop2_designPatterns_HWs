package HW2;

public class CreditCardPayment implements PaymentMethod{

    @Override
    public void pay(Payment payment) {
        System.out.println("Credit card payment: " + payment.getAmount() + " " + payment.getCurrency() + " to: " + payment.getReceiver());
    }
}
