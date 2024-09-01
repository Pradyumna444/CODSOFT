public class Main {
    public static void main(String[] args) {
        // Initialize the bank account with an initial balance
        BankAccount account = new BankAccount(500.00);
        
        // Initialize the ATM with the user's bank account
        ATM atm = new ATM(account);
        
        // Start the ATM
        atm.start();
    }
}
