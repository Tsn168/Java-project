public class Account {
    String accID;
    String accType; // Example: "saving" or "normal"
    String currency;
    double balance;

    // Constructor
    public Account(String accID, String accType, String currency, double balance) {
        this.accID = accID;
        this.accType = accType;
        this.currency = currency;
        this.balance = balance;
    }
}
