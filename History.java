import java.util.ArrayList;
import java.text.SimpleDateFormat;
// History.java
public class History {
    private String historyId;
    private static String userId; // Reference to the user associated with the history
    static String time; // Example: "2025-01-24 15:30:00"
    private String event; // Description of the event, e.g., "Loan Approved"
    public static String user_name;
    // Static list to store all history records
    public static ArrayList<History> historyList = new ArrayList<>();

    // Constructor
    public History(String historyId, String userId, String event) {
        this.historyId = historyId;
        this.userId = userId;
        SimpleDateFormat time =new SimpleDateFormat();
        this.event = event;
        historyList.add(this); // Add new history record to the list
    }
    public History(){

    }

    // Static method to display all history records
    public static void displayAllHistory() {
        for (History history : historyList) {
            System.out.println("History ID: " + history.historyId + ", User ID: " + history.userId +
                    ", Time: " + history.time + ", Event: " + history.event);
        }
    }
}
