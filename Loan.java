import java.util.ArrayList;

// Loan.java
public class Loan {
    private String loanId;
    private double loanAmount;
    private double interestRate;
    private String loanStatus; // Example: "Approved", "Pending", "Rejected"
    private String userId; // Reference to the user who took the loan

    // Static list to store all loan records
    public static ArrayList<Loan> loanList = new ArrayList<>();

    // Constructor
    public Loan(String loanId, double loanAmount, double interestRate, String loanStatus, String userId) {
        this.loanId = loanId;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.loanStatus = loanStatus;
        this.userId = userId;
        loanList.add(this); // Add new loan to the list
    }

    // Static method to display all loans
    public static void displayAllLoans() {
        for (Loan loan : loanList) {
            System.out.println("Loan ID: " + loan.loanId + ", Amount: " + loan.loanAmount +
                    ", Interest: " + loan.interestRate + "%, Status: " + loan.loanStatus +
                    ", User ID: " + loan.userId);
        }
    }
}
