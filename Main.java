interface PaymentStrategy {
    void pay(double amount);
}

class CreditCardPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paid with credit card: $" + amount);
    }
}

class PayPalPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paid with PayPal: $" + amount);
    }
}

class Checkout {
    private PaymentStrategy paymentStrategy;

    // Protected Variations: Allow different payment methods without changing Checkout
    public Checkout(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void completePayment(double amount) {
        paymentStrategy.pay(amount);
    }
}

public class Main {
    public static void main(String[] args) {
        // Example of using CreditCardPayment
        PaymentStrategy creditCardPayment = new CreditCardPayment();
        Checkout checkout1 = new Checkout(creditCardPayment);
        checkout1.completePayment(100.00); // Pays $100 with Credit Card

        // Example of using PayPalPayment
        PaymentStrategy paypalPayment = new PayPalPayment();
        Checkout checkout2 = new Checkout(paypalPayment);
        checkout2.completePayment(250.00); // Pays $250 with PayPal
    }
}
