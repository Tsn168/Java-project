import java.util.ArrayList;

public class Loan {
    private String loanId;
    private double loanAmount;
    private double interestRate;
    private String loanStatus; // Example: "Approved", "Pending", "Rejected"
    private String userId; // Reference to the user who took the loan

    // Static list to store all loan records
    public static ArrayList<Loan> loanList = new ArrayList<>();

    // Static loan account (default loan)
    public static Loan staticLoanAccount = new Loan("L000", 0.0, 0.0, "Inactive", "DefaultUser");

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

    // Static method to display the static loan account
    public static void displayStaticLoanAccount() {
        System.out.println("Static Loan Account:");
        System.out.println("Loan ID: " + staticLoanAccount.loanId + ", Amount: " + staticLoanAccount.loanAmount +
                ", Interest: " + staticLoanAccount.interestRate + "%, Status: " + staticLoanAccount.loanStatus +
                ", User ID: " + staticLoanAccount.userId);
    }
}
