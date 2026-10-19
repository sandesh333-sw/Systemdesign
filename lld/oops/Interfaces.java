
/**
 * INTERFACES IN JAVA
 *
 * An interface is a contract: a list of methods that any
 * implementing class must provide.
 *
 * It specifies WHAT a class must do, but leaves HOW it
 * does it up to each implementation.
 *
 * Interface = WHAT
 * Implementation = HOW
 */

// 1. Define the contract
interface PaymentGateway {
    void initiatePayment(double amount);
}

// 2. Stripe implements the contract
class StripePayment implements PaymentGateway {

    @Override
    public void initiatePayment(double amount) {
        System.out.println(
            "Processing payment via Stripe: $" + amount
        );
    }
}

// 3. Revolut implements the same contract
class RevolutPayment implements PaymentGateway {

    @Override
    public void initiatePayment(double amount) {
        System.out.println(
            "Processing payment via Revolut: £" + amount
        );
    }
}

// 4. Main class
public class Interfaces {

    public static void main(String[] args) {

        // Interface reference, Stripe implementation
        PaymentGateway stripe = new StripePayment();
        stripe.initiatePayment(100.00);

        // Interface reference, Revolut implementation
        PaymentGateway revolut = new RevolutPayment();
        revolut.initiatePayment(250.00);

        // Runtime polymorphism
        PaymentGateway gateway = new StripePayment();
        gateway.initiatePayment(500.00);

        // Switch implementation without changing the contract
        gateway = new RevolutPayment();
        gateway.initiatePayment(750.00);
    }
}
