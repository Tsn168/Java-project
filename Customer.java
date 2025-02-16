import java.util.ArrayList;

public class Customer extends User implements DisplayInfo {  //  Inherits from `User`
    private static ArrayList<Customer> customerList = new ArrayList<>();
    private int customerID;
    private String name;
    private String phone;
    private String birthdate;
    private ArrayList<Account> accounts;

    private static int totalCustomers = 0;

    //  Constructor for Registration
    public Customer(String name, String email, String phone, String birthdate, String password) {
        super(email, password); //  Calls User constructor
        this.customerID = ++totalCustomers;
        this.name = name;
        this.phone = phone;
        this.birthdate = birthdate;
        this.accounts = new ArrayList<>();
        customerList.add(this);
    }

    // Adds an account to the customer
    public void addAccount(Account account) {
        accounts.add(account);
    }

    //  Displays all account numbers and types (Only if logged in)
    public void displayAccountNumbers() {

    }

    //  Getter for Name
    public String getName() {
        if (isLoggedIn()) {
            return name;
        } else {
            System.out.println("Access Denied: Please log in to view your name.");
            return null; 
        }
    }

    //  Getter for Birthdate
    public String getBirthdate() {
        if (isLoggedIn()) {
            return birthdate;
        } else {
            System.out.println("Access Denied: Please log in to view your name.");
            return null;
        }
    }

    //  Getter for Phone
    public String getPhone() {
        if (isLoggedIn()) {
            return phone;
        } else {
            System.out.println("Access Denied: Please log in to view your name.");
            return null;
        }
    }

    

    public void setName(String name) {
        if (isLoggedIn()) {
            this.name = name;
        } else {
            System.out.println("Access Denied: Please log in to change your name.");
        }
    }
    
    public void setPhone(String phone) {
        if (isLoggedIn()) {
            this.phone = phone;
        } else {
            System.out.println("Access Denied: Please log in to change your phone number.");
        }
    }
    
    public void setBirthdate(String birthdate) {
        if (isLoggedIn()) {
            this.birthdate = birthdate;
        } else {
            System.out.println("Access Denied: Please log in to change your birthdate.");
        }
    }

    //  Overriding `displayUserInfo()`
    @Override
    public void displayUserInfo() {
        if (isLoggedIn()) {
            System.out.println("Customer ID: " + customerID + ", Name: " + name + ", Email: " + email + ", Phone: " + phone);
        } else {
            System.out.println("Access Denied: Please log in to view your information.");
        }
    }
}
