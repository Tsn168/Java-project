
public class Payment {

    static int totalPaymentAccount = 0;
    int user_ID;
    double amount;
    int payment_ID;
    String reciver;
    String payment_date;

    Payment(int user_ID, double amount, String reciver, String payment_date) {
        this.user_ID = user_ID;
        this.amount = amount;
        this.reciver = reciver;
        this.payment_date = payment_date;
    }
}
