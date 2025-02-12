import java.util.Date;

public class Transaction {
    private String date;
    private String description;
    private double amount;

    public Transaction(String description, double amount) {
        this.date = new Date().toString();  // Timestamp of the transaction
        this.description = description;
        this.amount = amount;
    }
    @Override
    public String toString() {
        return "Date: " + date + " | Description: " + description + " | Amount: $" + amount;
    }

    public String getDate() { return date; }
    public String getDescription() { return description; }
    public double getAmount() { return amount; }
}
