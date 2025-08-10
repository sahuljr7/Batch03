package assignment;

// Base class
class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    double getBalance() {
        return balance;
    }
}

// Subclass of BankAccount
class SavingsAccount extends BankAccount {

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Withdrawal denied: Balance cannot fall below 100.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
}

// Main class
public class Program5 {

    public static void main(String[] args) {
        SavingsAccount myAccount = new SavingsAccount(200.0);

        myAccount.deposit(50.0);         // Deposited: 50.0
        myAccount.withdraw(120.0);       // Withdrawn: 120.0
        System.out.println("Balance: " + myAccount.getBalance()); // Balance: 130.0

        myAccount.withdraw(50.0);        // Withdrawal denied: Balance cannot fall below 100.
        System.out.println("Balance: " + myAccount.getBalance()); // Balance: 130.0
    }
}
