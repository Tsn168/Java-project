import java.util.ArrayList;

public class Payment {
    static int payment_counter = 0;
    private int user_ID; //who made the payment
    public double amount; //the amount of money 
    private int payment_ID; //whp get the payment
    String receiver;//who  received the payment
    String payment_date;// the date of payment

    // ArrayList to store payment instances
    static ArrayList<Payment> payments = new ArrayList<>();

    // Constructor
    Payment(int user_ID, double amount, String receiver, String payment_date) {
        this.user_ID = user_ID;
        this.amount = amount;
        this.receiver = receiver;
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

    public String getReceiver() {
        return receiver;
    }

    public void setReciver(String receiver) {
        this.receiver = receiver;
    }

    public String getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(String payment_date) {
        this.payment_date = payment_date;
    }

    // Method to display all payments
    public static void displayPayments() {
        for (Payment payment : payments) { //oayments is the arraylist of Payment 
            System.out.println("Payment ID: " + payment.payment_ID + ", User ID: " + payment.user_ID + 
                               ", Amount: " + payment.amount + ", Receiver: " + payment.receiver +
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
        for (Payment payment : payments) //int i = 0; i < payment.amount; i++) 
        {
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