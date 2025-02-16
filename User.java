// inheritance 
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

    //  Getter for Email
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
