public class Staff extends Account {  // Staff extends Account
    private static int totalStaff = 0; // Tracks total number of staff
    private int staffID;
    private String name;
    private String position; // Staff's position in the organization
    private boolean loggedIn; // Tracks if the staff is logged in

    // Constructor for Staff Registration
    public Staff(String name, String position, String email, String password, double startBalance, String accountType, boolean isAdmin) {
        super(startBalance, accountType, null, email, password, isAdmin);  // Calls Account constructor
        this.staffID = ++totalStaff;
        this.name = name;
        this.position = position;
        this.loggedIn = false;
    }

    // Login method (Checks credentials for Staff)
    public boolean login() {
        // You can extend the logic to check login credentials (this is just a simplified version)
        if (this.isAdmin()) {
            loggedIn = true;
            System.out.println("Login Successful! Welcome, Admin " + name);
            return true;
        } else {
            loggedIn = true;
            System.out.println("Login Successful! Welcome, Staff " + name);
            return true;
        }
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

    // Check if staff is logged in
    public boolean isLoggedIn() {
        return loggedIn;
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Getter for Position
    public String getPosition() {
        return position;
    }

    // Getter for Staff ID
    public int getStaffID() {
        return staffID;
    }

    // Display staff details
    public void displayStaffDetails() {
        if (loggedIn) {
            System.out.println("Staff ID: " + staffID + ", Name: " + name + ", Position: " + position);
            System.out.println("Account Number: " + getAccountNumber() + ", Balance: " + getBalance() + ", Account Type: " + getAccountType());
        } else {
            System.out.println("Access Denied: Please log in first.");
        }
    }

    // toString() method (Displays staff details)
    @Override
    public String toString() {
        return "Staff ID: " + staffID + ", Name: " + name + ", Position: " + position + ", Email: " + getEmail();
    }
}
