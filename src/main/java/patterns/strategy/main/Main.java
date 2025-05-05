package patterns.strategy.main;


import patterns.strategy.CreditCardPayment;
import patterns.strategy.PayPalPayment;
import patterns.strategy.PaymentContext;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Card payment
        context.setStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        context.executePayment(50.0);

        // PayPal payment
        context.setStrategy(new PayPalPayment("user@gmail.com"));
        context.executePayment(58.0);
    }
}
