// History.java
public class History {
    String historyId;
    String userId; // Reference to the user associated with the history
    String time; // Example: "2025-01-24 15:30:00"
    String event; // Description of the event, e.g., "Loan Approved"

    // Constructor
    public History(String historyId, String userId, String time, String event) {
        this.historyId = historyId;
        this.userId = userId;
        this.time = time;
        this.event = event;
    }
}
