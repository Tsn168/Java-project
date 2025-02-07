import java.util.ArrayList;

public class Payment {
    static int payment_counter = 0;
    private int user_ID;
    public double amount;
    private int payment_ID;
    String reciver;
    String payment_date;

    // ArrayList to store payment instances
    static ArrayList<Payment> payments = new ArrayList<>();

    // Constructor
    Payment(int user_ID, double amount, String reciver, String payment_date) {
        this.user_ID = user_ID;
        this.amount = amount;
        this.reciver = reciver;
        this.payment_date = payment_date;
        this.payment_ID = ++payment_counter;
        payments.add(this); // Add the current payment to the ArrayList
    }

    // Getters and Setters for the fields
    public int getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(int user_ID) {
        this.user_ID = user_ID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getPayment_ID() {
        return payment_ID;
    }

    public void setPayment_ID(int payment_ID) {
        this.payment_ID = payment_ID;
    }

    public String getReciver() {
        return reciver;
    }

    public void setReciver(String reciver) {
        this.reciver = reciver;
    }

    public String getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(String payment_date) {
        this.payment_date = payment_date;
    }

    // Method to display all payments
    public static void displayPayments() {
        for (Payment payment : payments) {
            System.out.println("Payment ID: " + payment.payment_ID + ", User ID: " + payment.user_ID +
                               ", Amount: " + payment.amount + ", Receiver: " + payment.reciver +
                               ", Date: " + payment.payment_date);
        }
    }
    // Method to get the total amount of all payments
    public static double getTotalAmount() {
        double total = 0;
        for (Payment payment : payments) {
            total += payment.amount;
        }
        return total;
    }

    // Method to find payment by user ID
    public static Payment findPaymentByUserID(int user_ID) {
        for (Payment payment : payments) {
            if (payment.getUser_ID() == user_ID) {
                return payment;
            }
        }
        return null; // Return null if no payment found for the given user ID
    }

    // Method to find payment by payment ID
    public static Payment findPaymentByID(int payment_ID) {
        for (Payment payment : payments) {
            if (payment.getPayment_ID() == payment_ID) {
                return payment;
            }
        }
        return null; // Return null if no payment found for the given payment ID
    }
}