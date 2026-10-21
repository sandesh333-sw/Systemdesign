
/**
 * Encapsulation:
 * Hiding an object's internal data and
 * providing controlled access through methods.
 */

class BankAccount {

    // Private variable
    private double balance = 0;

    // Getter - read the balance
    public double getBalance() {
        return balance;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: £" + amount);
        } else {
            System.out.println("Invalid deposit!");
        }
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.deposit(100);
        account.deposit(-50);

        System.out.println(
            "Balance: £" + account.getBalance()
        );


    }
}
