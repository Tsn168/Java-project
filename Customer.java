import java.util.ArrayList;

public class Customer extends Account {  // Customer now extends Account
    private static ArrayList<Customer> customerList = new ArrayList<>(); // Stores all registered customers

    private int customerID;
    private String name;
    private String phone;
    private String birthdate;
    private String password;
    private boolean loggedIn; // Tracks login status
    private static int totalCustomers = 0; // Auto-increments customer ID

    // Constructor for Registration
    public Customer(String name, String email, String phone, String birthdate, String password, double startBalance, String accountType, boolean isAdmin) {
        super(startBalance, accountType, null, email, password, isAdmin);  // Calls Account constructor
        this.customerID = ++totalCustomers;
        this.name = name;
        this.phone = phone;
        this.birthdate = birthdate;
        this.loggedIn = false;
        this.email = email;
        customerList.add(this); // Adds new customer to the list
    }

    // Constructor for Login (Used to check credentials)
    public Customer(String email, String password) {
        super(0, "Normal", null, email, password, false);  // Placeholder values for Account constructor
        this.email = email;
        this.password = password;
    }

    // Login method (Finds matching email & password)
    public boolean login() {
        for (Customer customer : customerList) {
            if (customer.email.equals(this.email) && customer.password.equals(this.password)) {
                customer.loggedIn = true;
                System.out.println("Login Successful! Welcome, " + customer.name);
                return true;
            }
        }
        System.out.println("Login Failed: Incorrect email or password.");
        return false;
    }

    // Logout method
    public void logout() {
        if (loggedIn) {
            loggedIn = false;
            System.out.println("You have been logged out.");
        } else {
            System.out.println("You are not logged in.");
        }
    }

    // Checks if the customer is logged in
    public boolean isLoggedIn() {
        return loggedIn;
    }

    // Add account to the customer
    public void addAccount(Account account) {
        if (account != null) {
            super.setBalance(account.getBalance());  // Use inherited method from Account to set balance
            System.out.println("Account added to " + name);
        }
    }

    // Display account details if logged in
    public void displayAccountDetails() {
        if (loggedIn) {
            System.out.println("Customer ID: " + customerID + ", Name: " + name);
            System.out.println("Account Number: " + getAccountNumber() + ", Balance: " + getBalance() + ", Account Type: " + getAccountType());
        } else {
            System.out.println("Access Denied: Please log in first.");
        }
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Getter for Email
    public String getEmail() {
        return email;
    }

    // toString() method (Displays customer details)
    @Override
    public String toString() {
        return "Customer ID: " + customerID + ", Name: " + name + ", Email: " + email + ", Phone: " + phone + ", Birthdate: " + birthdate;
    }
}
