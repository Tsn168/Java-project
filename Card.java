import java.util.Random;
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;

public class Card {
    String status;  // Active or Freeze
    private String exp_date;  // Expiry date (6 years expiration)
    private long card_num;  // 16 digits
    String card_type;  // Visa or Saving (normal account)
    private int CVV;  // 3-digit number
    String card_holder;
    private double creditLimit;
    private double balance;
    private String password;
    private static ArrayList<String> customer_cards= new ArrayList<>();
    Card() {
        status = "Active";
        exp_date = "Empty";
        card_num = 0;
        card_type = "Empty";
        CVV = 0;
        card_holder = "Unknown";
        password="**";
    }

    Card(String holder, long number, String expirationDate) {
        card_holder = holder;
        card_num = number;
        exp_date = expirationDate;
        status = "Active";
        CVV = new Random().nextInt(900) + 100; 
        card_type = "Visa";
        password="**";
    }

    public void card_creation(String name) {
        card_holder=name;
        Random rand = new Random();
        long number = 1000000000000000L + (long)(rand.nextDouble() * 9000000000000000L); 
        card_num=number;
        CVV = rand.nextInt(900) + 100; 
        Date currentDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        int current_year = calendar.get(Calendar.YEAR);
        int current_month = calendar.get(Calendar.MONTH) + 1;  
        
        exp_date = (current_month + 1) + "/" + (current_year + 6);

        System.out.println("Here is your new card that just got created: \n");
        System.out.println("Card holder: " + name);
        System.out.println("Status: " + status);
        System.out.println("EXP Date: " + exp_date);
        System.out.println("CVV: " + CVV);
        System.out.println("Card Number: " + number);
        customer_cards.add(this);

    }

    public void Get_Card_info(String password_in) {
        if (password_in.equals(password)){//ex password of user is 1234
            System.out.println("Card Info: ");
            System.out.println("Card holder: " + card_holder);
            System.out.println("Status: " + status);
            System.out.println("Card Number: " + card_num);
            System.out.println("EXP Date: " + exp_date);
            System.out.println("CVV: " + CVV);
        } else {
            System.out.println("Invalid password.");
        }
    }
    public void makePurchaseWithThreshold(double amount) {
        if (amount > creditLimit) {  
            System.out.println("ALERT: Large transaction detected! Transaction amount: $" + amount);
        }
        makePurchase(amount);
    }
  
    public void setCreditLimit(double limit) {
        creditLimit = limit;
        balance = limit; 
        System.out.println("Credit limit set to $" + creditLimit);
    }
    
    public void makePurchase(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Purchase successful! Remaining balance: $" + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
    
    public void makePayment(double amount) {
        balance += amount;
        System.out.println("Payment successful! Current balance: $" + balance);
    }
    
    public double getBalance() {
        return balance;
    }

}
