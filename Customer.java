import java.util.ArrayList;

public class Customer implements DisplayInfo {
    private static ArrayList<Customer> customerList = new ArrayList<>(); // ✅ Stores all registered customers

    private int customerID;
    private String name;
    private String email;
    private String phone;
    private String birthdate;
    private String password;
    private boolean loggedIn; // ✅ Tracks login status
    private ArrayList<Account> accounts; // ✅ Stores customer's accounts

    private static int totalCustomers = 0; // ✅ Auto-increments customer ID

    // ✅ Constructor for Registration
    public Customer(String name, String email, String phone, String birthdate, String password) {
        this.customerID = ++totalCustomers;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.birthdate = birthdate;
        this.password = password;
        this.loggedIn = false;
        this.accounts = new ArrayList<>();
        customerList.add(this); // ✅ Adds new customer to the list
    }

    // ✅ Constructor for Login (Used to check credentials)
    public Customer(String email, String password) {
        this.email = email;
        this.password = password;
    }

    // ✅ Login method (Finds matching email & password)
    public boolean login() {
        for (int i = 0; i < customerList.size(); i++) { // ✅ Normal for-loop (No Shortcut)
            Customer customer = customerList.get(i); // ✅ Get customer at index `i`
            
            if (customer.email.equals(this.email) && customer.password.equals(this.password)) {
                customer.loggedIn = true;
                System.out.println("Login Successful! Welcome, " + customer.name);
                return true;
            }
        }
        System.out.println("Login Failed: Incorrect email or password.");
        return false;
    }

    // ✅ Logout method
    public void logout() {
        if (loggedIn) {
            loggedIn = false;
            System.out.println("You have been logged out.");
        } else {
            System.out.println("You are not logged in.");
        }
    }

    // ✅ Checks if the customer is logged in
    public boolean isLoggedIn() {
        return loggedIn;
    }

    // ✅ Adds an account to the customer
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // ✅ Displays all account numbers and types (Only if logged in)
    public void displayAccountNumbers() {
        if (loggedIn) {
            if (accounts.isEmpty()) {
                System.out.println("You have no accounts.");
            } else {
                System.out.println("\nYour Accounts:");
                for (int i = 0; i < accounts.size(); i++) { // ✅ Normal for-loop (No Shortcut)
                    Account acc = accounts.get(i); // ✅ Get account at index `i`
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

    // ✅ Getter for Email
    public String getEmail() {
        return email;
    }

    // ✅ toString() method (Displays customer details)
    @Override
    public String toString() {
        return "Customer ID: " + customerID + ", Name: " + name + ", Email: " + email + ", Phone: " + phone +
               ", Birthdate: " + birthdate + ", Accounts: " + accounts.size();
    }
    public void displayUserInfo(){
        
    }
}
