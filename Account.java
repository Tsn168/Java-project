import java.util.ArrayList;

public class Account implements DisplayInfo {
    private static int nextAccountNumber = 1000; // Auto-generates unique account numbers
    private static ArrayList<Account> allAccounts = new ArrayList<>(); // Stores all accounts

    private int accountNumber;
    private double balance;
    private String accountType; // "Saving" or "Normal"
    private Customer owner;

    // Constructor for Registering an Account (Auto-generates account number)
    public Account(double startBalance, String accountType, Customer owner) {
        this.accountNumber = nextAccountNumber;
        nextAccountNumber = nextAccountNumber + 1; // Increment account number

        // to make sure the balance is not negative
        if (startBalance < 0) {
            this.balance = 0;
        } else {
            this.balance = startBalance;
        }

        this.accountType = accountType;
        this.owner = owner;
        allAccounts.add(this); // Add the current account to the list of all accounts
        owner.addAccount(this); // Add current account to the owner's list of accounts
    }

    // Getter for Account Number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Getter for Account Type
    public String getAccountType() {
        return accountType;
    }

    // Getter for Balance
    public double getBalance() {
        return balance;
    }

    // Deposit Money (Checks if logged in)
    public void deposit(double amount) {
        if (owner.isLoggedIn()) {
            if (amount > 0) {
                balance = balance + amount;
                System.out.println("Deposit successful! New balance: $" + balance);
            } else {
                System.out.println("Invalid deposit amount. Must be greater than 0.");
            }
        } else {
            System.out.println("Access Denied: Please log in first.");
        }
    }

    // Withdraw Money (Checks if logged in)
    public void withdraw(double amount) {
        if (owner.isLoggedIn()) {
            if (amount > 0) {
                if (amount <= balance) {
                    balance = balance - amount;
                    System.out.println("Withdrawal successful! New balance: $" + balance);
                } else {
                    System.out.println("Error: Insufficient funds.");
                }
            } else {
                System.out.println("Invalid withdrawal amount. Must be greater than 0.");
            }
        } else {
            System.out.println("Access Denied: Please log in first.");
        }
    }

    // Find Account by Account Number (No Shortcut)
    public static Account findAccountByNumber(int accNum) {
        for (int i = 0; i < allAccounts.size(); i++) { // Normal for-loop
            Account acc = allAccounts.get(i); // Get account at index `i`

            if (acc.accountNumber == accNum) {
                return acc; // Returns the account if the number matches
            }
        }
        return null; // Returns null if no match is found
    }

    // toString() method (Displays account details)
    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Type: " + accountType + ", Balance: $" + balance + ", Owner: " + owner.getName();
    }

    // DisplayUserInfo method (Implementation of DisplayInfo interface)
    @Override
    public void displayUserInfo() {
        System.out.println("Account Information:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: $" + balance);
        System.out.println("Owner: " + owner.getName());
    }
}