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
