// History.java
public class History {
    String historyId;
    String transactionType; // Example: "Loan Repayment", "Loan Disbursement"
    String date;
    double amount;
    String loanId; // Reference to the associated loan

    // Constructor
    public History(String historyId, String transactionType, String date, double amount, String loanId) {
        this.historyId = historyId;
        this.transactionType = transactionType;
        this.date = date;
        this.amount = amount;
        this.loanId = loanId;
    }
}