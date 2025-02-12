import java.util.Date;
import java.util.Random;

public class Card {
    String status; // Active or Freeze
    private String exp_date; // 6 years expiry
    private String card_num; // Must be 16-digit, stored as String
    String card_type; // Visa or Saving (normal account)
    private int CVV;
    String card_holder;

    // Default Constructor
    Card() {
        status = "Active";
        exp_date = "Empty";
        card_num = "0000000000000000"; // Initialize as a valid string
        card_type = "Empty";
        CVV = 000;
    }

    // Parameterized Constructor
    Card(String holder, String number, String exp) {
        card_holder = holder;
        card_num = number;
        exp_date = exp;
    }

    // Method to create a new card
    public void card_creation(String name) {
        Random rand = new Random();
        StringBuilder newCardNum = new StringBuilder();

        // Generate a random 16-digit card number
        for (int i = 0; i < 16; i++) {
            newCardNum.append(rand.nextInt(10)); // Appends a random digit (0-9)
        }
        card_num = newCardNum.toString();
        
        // Generate a random 3-digit CVV
        CVV = rand.nextInt(900) + 100; // Ensures a 3-digit number (100-999)

        Date date = new Date();
        int currentYear = date.getYear() + 1900; // Get full year
        int expYear = currentYear + 6; // Card expires in 6 years
        int currentMonth = date.getMonth() + 1; // Month starts from 0

        exp_date = currentMonth + "/" + expYear; // Store expiry date

        // Print card details
        System.out.println("Here is your new card that was just created:");
        System.out.println("Card Holder  : " + name);
        System.out.println("Status       : " + status);
        System.out.println("EXP Date     : " + exp_date);
        System.out.println("CVV          : " + CVV);
        System.out.println("Card Number  : " + card_num);
    }

    // Method to get card info (authentication required)
    public void Get_Card_info(String password) {
        if (password.equals("1234")) { // Replace with real authentication logic
            System.out.println("Card Holder  : " + card_holder);
            System.out.println("Status       : " + status);
            System.out.println("EXP Date     : " + exp_date);
            System.out.println("Card Type    : " + card_type);
            System.out.println("Card Number  : " + card_num);
            System.out.println("CVV          : " + CVV);
        } else {
            System.out.println("Incorrect Password. Access Denied!");
        }
    }