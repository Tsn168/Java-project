import java.util.ArrayList;

public class Customer extends User implements DisplayInfo {  // ✅ Inherits from `User`
    private static ArrayList<Customer> customerList = new ArrayList<>();
    private int customerID;
    private String name;
    private String phone;
    private String birthdate;
    private ArrayList<Account> accounts;

    private static int totalCustomers = 0;

    // ✅ Constructor for Registration
    public Customer(String name, String email, String phone, String birthdate, String password) {
        super(email, password); // ✅ Calls User constructor
        this.customerID = ++totalCustomers;
        this.name = name;
        this.phone = phone;
        this.birthdate = birthdate;
        this.accounts = new ArrayList<>();
        customerList.add(this);
    }

    // ✅ Adds an account to the customer
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // ✅ Displays all account numbers and types (Only if logged in)
    public void displayAccountNumbers() {
        if (isLoggedIn()) {
            if (accounts.isEmpty()) {
                System.out.println("You have no accounts.");
            } else {
                System.out.println("\nYour Accounts:");
                for (int i = 0; i < accounts.size(); i++) {
                    Account acc = accounts.get(i);
                    System.out.println("- Account Number: " + acc.getAccountNumber() + " (" + acc.getAccountType() + ")");
                }
            }
        } else {
            System.out.println("Access Denied: Please log in first.");
        }
    }

    // ✅ Getter for Name
    public String getName() {
        return name;
    }

    // ✅ Getter for Birthdate
    public String getBirthdate() {
        return birthdate;
    }

    // ✅ Overriding `displayUserInfo()`
    @Override
    public void displayUserInfo() {
        System.out.println("Customer ID: " + customerID + ", Name: " + name + ", Email: " + email + ", Phone: " + phone);
    }
}
