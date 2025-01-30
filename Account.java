public class Account {
    String accountID;
    String accountType; //saving/normal
    String currency;
    double balance;

    // Constructor
    public Account(String accID, String accType, String currency, double balance) {
        this.accountID = accID;
        this.accountType = accType;
        this.currency = currency;
        this.balance = balance;
    }
}
