package patterns.strategy;

public class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount){
        System.out.println("Paying " + amount + "$ to PayPal: " + email);
    }
}
