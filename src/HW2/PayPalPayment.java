package HW2;

public class PayPalPayment implements PaymentMethod{
    @Override
    public void pay(Payment payment) {
        System.out.println("PayPal payment " + payment.getAmount() + " " + payment.getCurrency() + " to: " + payment.getReceiver());
    }
}
