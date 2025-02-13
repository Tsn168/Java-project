import java.util.ArrayList;

public class Account extends User {  //  Inherits from User (for login)
    private static int nextAccountNumber = 1000;  //  Generates unique account numbers
    private static ArrayList<Account> allAccounts = new ArrayList<>();  //  Stores all accounts

    private int accountNumber;
    private double balance;
    private String accountType;
    private Customer owner;

    //  Constructor (Creates an account)
    public Account(double startBalance, String accountType, Customer owner) {
        super(owner.getEmail(), owner.password); //  Uses Customer login details
        this.accountNumber = nextAccountNumber;
        nextAccountNumber++;  //  Increments for the next account
        this.balance = startBalance;
        this.accountType = accountType;
        this.owner = owner;
        allAccounts.add(this);  //  Stores account in the list
        owner.addAccount(this);  //  Links account to the owner
    }

    //  Getter for Account Owner
    public Customer getOwner() {
        return owner;
    }

    //  Getter for Account Number
    public int getAccountNumber() {
        if (isLoggedIn()) {
            return accountNumber;
        } else {
            System.out.println("Access Denied: Please log in to view your account number.");
            return -1; // Or throw an exception
        }
    }

    //  Getter for Account Type
    public String getAccountType() {
        if (isLoggedIn()) {
            return accountType;
        } else {
            System.out.println("Access Denied: Please log in to view your account type.");
            return null; // Or throw an exception
        }
    }

    //  Deposit Money
    public void deposit(double amount) {

    }

    //  Withdraw Money
    public void withdraw(double amount) {

    }

    // Check Account Balance
    public double getBalance() {
        if (isLoggedIn()) {
            return balance;
        } else {
            System.out.println("Access Denied: Please log in to view your balance.");
            return -1; // Or throw an exception
        }
    }

    //  Find an Account by Account Number
    public static Account findAccountByNumber(int accNum) {
        for (int i = 0; i < allAccounts.size(); i++) {  
            Account acc = allAccounts.get(i);
            if (acc.accountNumber == accNum) {
                return acc;
            }
        }
        return null;  //  Returns null if no matching account is found
    }

    //  Display Account Info
    public void displayAccountInfo() {
        if (isLoggedIn()) {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Type: " + accountType);
            System.out.println("Balance: $" + balance);
        } else {
            System.out.println("Access Denied: Please log in to view your account information.");
        }
    }
}
