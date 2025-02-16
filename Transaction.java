import java.text.SimpleDateFormat;

public class Transaction extends History {
    private String description;
    private double amount;

    public Transaction(String description, double amount) {
        super();
        this.description = description;
        this.amount = amount;
    }
    @Override
    public String toString() {
        return "Date: " + time + " | Description: " + description + " | Amount: $" + amount +"| Name :" + user_name ;
    }

    public String getDate(){ 
        SimpleDateFormat formatter=new SimpleDateFormat();
        return formatter.format(time); 
    }
    public String getDescription() { 
        return description; 
    }
    public double getAmount() {
        return amount;
    }
}
