package HW2;

public class App {
   public static void main(String[] args) {
        Payment firstPayment = new Payment(2.01, "EUR", "Hakan", "Shop");
        Payment secondPayment = new Payment(9.99, "EUR", "Hakan", "Steam");
        Payment thirdPayment = new Payment(45.00, "EUR", "Hakan", "Amazon.de");


        PaymentMethod debit = new DebitCardPayment();
        PaymentMethod paypal = new PayPalPayment();
        PaymentMethod credit = new CreditCardPayment();

        debit.pay(firstPayment);
        paypal.pay(secondPayment);
        credit.pay(thirdPayment);
    }
}
