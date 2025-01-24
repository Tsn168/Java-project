// Loan.java
public class Loan {
    String loanId;
    double loanAmount;
    double interestRate;
    String loanStatus; // Example: "Approved", "Pending", "Rejected"
    String userId; // Reference to the user who took the loan

    // Constructor
    Loan(String loanId, double loanAmount, double interestRate, String loanStatus, String userId) {
        this.loanId = loanId;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.loanStatus = loanStatus;
        this.userId = userId;
    }
}

