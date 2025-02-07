import java.util.ArrayList;

// History.java
public class History {
    private String historyId;
    private String userId; // Reference to the user associated with the history
    private String time; // Example: "2025-01-24 15:30:00"
    private String event; // Description of the event, e.g., "Loan Approved"

    // Static list to store all history records
    public static ArrayList<History> historyList = new ArrayList<>();

    // Constructor
    public History(String historyId, String userId, String time, String event) {
        this.historyId = historyId;
        this.userId = userId;
        this.time = time;
        this.event = event;
        historyList.add(this); // Add new history record to the list
    }

    // Static method to display all history records
    public static void displayAllHistory() {
        for (History history : historyList) {
            System.out.println("History ID: " + history.historyId + ", User ID: " + history.userId +
                    ", Time: " + history.time + ", Event: " + history.event);
        }
    }
}
