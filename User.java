// Superclass: User
public class User {
    protected String email;
    protected String password;
    protected boolean loggedIn;

    //  Constructor for Registration
    public User(String email, String password) {
        this.email = email;
        this.password = password;
        this.loggedIn = false;
    }

    // Login method
    public boolean login(String email, String password) {
        if (this.email.equals(email) && this.password.equals(password)) {
            this.loggedIn = true;
            System.out.println("Login Successful!");
            return true;
        }
        System.out.println("Login Failed: Incorrect email or password.");
        return false;
    }

    //  Logout method
    public void logout() {
        if (loggedIn) {
            loggedIn = false;
            System.out.println("You have been logged out.");
        } else {
            System.out.println("You are not logged in.");
        }
    }

    //  Checks if the user is logged in
    public boolean isLoggedIn() {
        return loggedIn;
    }
    
    // Getter for Email
    public String getEmail() {
        if (isLoggedIn()) {
            return email;
        } else {
            System.out.println("Access Denied: Please log in to view your info.");
            return null; 
    }
    }

    //  Getter for Password
    public String getPassword() {
        if (isLoggedIn()) {
            return password;
        } else {
            System.out.println("Access Denied: Please log in to view your info.");
            return null; 
        }
    }

    // Setter for Email
    public void setEmail(String email) {
        if (isLoggedIn()) {
            this.email = email;
        } else {
            System.out.println("Access Denied: Please log in to update email.");
        }
    }
    
    // Setter for Password
    public void setPassword(String password) {
        if (isLoggedIn()) {
            this.password = password;
        } else {
            System.out.println("Access Denied: Please log in to update password.");
        }
    }    

    //  Placeholder for subclasses to implement
    public void displayUserInfo() {
        System.out.println("User Info: Email - " + email);
    }
}

// Subclass: Account (Superclass of Customer and Staff)
public class Account extends User {
    private int accountNumber;
    private double balance;
    private String accountType;

    public Account(String email, String password, int accountNumber, double balance, String accountType) {
        super(email, password); // Calls the constructor of User class
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
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
}

// Subclass: Customer (Subclass of Account)
public class Customer extends Account {
    private String name;
    private String phone;
    private String birthdate;

    public Customer(String email, String password, int accountNumber, double balance, String accountType, String name, String phone, String birthdate) {
        super(email, password, accountNumber, balance, accountType); // Calls the constructor of Account class
        this.name = name;
        this.phone = phone;
        this.birthdate = birthdate;
    }

    // Getter for Customer Name
    public String getName() {
        return name;
    }

    // Getter for Customer Phone
    public String getPhone() {
        return phone;
    }

    // Getter for Customer Birthdate
    public String getBirthdate() {
        return birthdate;
    }
}

// Subclass: Staff (Subclass of Account)
public class Staff extends Account {
    private String role;

    public Staff(String email, String password, int accountNumber, double balance, String accountType, String role) {
        super(email, password, accountNumber, balance, accountType); // Calls the constructor of Account class
        this.role = role;
    }

    // Getter for Staff Role
    public String getRole() {
        return role;
    }
}
