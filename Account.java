import java.util.ArrayList;

// Account class - Subclass of User
public class Account extends User {
    private static int nextAccountNumber = 1000; // Auto-generates unique account numbers
    private static ArrayList<Account> allAccounts = new ArrayList<>(); // Stores all accounts

    private int accountNumber;
    private double balance;
    private String accountType; // "Saving" or "Normal"
    private Customer owner;
    private boolean isAdmin; // True = Admin, False = User

    // Constructor for Registering an Account (Auto-generates account number)
    public Account(String email, String password, double startBalance, String accountType, Customer owner, boolean isAdmin) {
        super(email, password); // Call the User class constructor for email and password
        this.accountNumber = nextAccountNumber++;
        this.balance = Math.max(startBalance, 0); // Ensure balance is not negative
        this.accountType = accountType;
        this.owner = owner;
        this.isAdmin = isAdmin;

        allAccounts.add(this); // Add the account to the list of all accounts
        owner.addAccount(this); // Add to the owner's list of accounts
    }

    // Getter Methods
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public String getEmail() {
        return getEmail(); // Inherited from User class
    }

    // Setter for balance (Controlled modification)
    public void setBalance(double newBalance) {
        if (newBalance >= 0) {
            this.balance = newBalance;
        } else {
            System.out.println("Error: Balance cannot be negative.");
        }
    }

    // Deposit Money (Checks if logged in)
    public void deposit(double amount) {
        if (owner.isLoggedIn()) {
            if (amount > 0) {
                balance += amount;
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
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal successful! New balance: $" + balance);
            } else {
                System.out.println("Error: Invalid withdrawal amount or insufficient funds.");
            }
        } else {
            System.out.println("Access Denied: Please log in first.");
        }
    }

    // Find Account by Account Number
    public static Account findAccountByNumber(int accNum) {
        for (Account acc : allAccounts) { // Enhanced for-loop
            if (acc.accountNumber == accNum) {
                return acc;
            }
        }
        return null; // Returns null if no match is found
    }

    // toString() method (Displays account details)
    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Type: " + accountType + ", Balance: $" + balance +
               ", Owner: " + owner.getName() + ", Role: " + (isAdmin ? "Admin" : "User");
    }
}
