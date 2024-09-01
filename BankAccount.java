public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance! Cannot withdraw $" + amount);
            return false;
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
            return false;
        } else {
            balance -= amount;
            System.out.println("Successfully withdrew: $" + amount);
            return true;
        }
    }
}
