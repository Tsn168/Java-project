//inheritance
public class User {
    private String email;
    private String password;
    private boolean loggedIn;

    // Constructor for User class
    public User(String email, String password) {
        this.email = email;
        this.password = password;
        this.loggedIn = false;
    }

    // Login method
    public boolean login() {
        if (this.email.equals(email) && this.password.equals(password)) {
            loggedIn = true;
            System.out.println("Login Successful!");
            return true;
        } else {
            System.out.println("Login Failed: Incorrect email or password.");
            return false;
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

    // Getter for loggedIn status
    public boolean isLoggedIn() {
        return loggedIn;
    }
    
    // Getter for Email
    public String getEmail() {
        return email;
    }
}
