public class Notification {
    static int allMessage = 0; 
    private int user_ID;
    private String message;
    private String time;
    public Notification(int user_ID, String message, String time) {
        this.user_ID = user_ID;
        this.message = message;
        this.time = time;
        allMessage++;
    }
    public void displayNotification() {
        System.out.println("User ID: " + user_ID);
        System.out.println("Message: " + message);
        System.out.println("Time: " + time);
        System.out.println("-----------------------------");
    }
    public int getUserID() {
        return user_ID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public static int getTotalMessages() {
        return allMessage;
    }
    public boolean containsKeyword(String keyword) {
        return message.toLowerCase().contains(keyword.toLowerCase());
    }
    public String getFormattedNotification() {
        return " [User " + user_ID + "] " + message + " (at " + time + ")";
    }
    
    public String toString() {
        return "Notification{" +
               "user_ID=" + user_ID +
               ", message='" + message + '\'' +
               ", time='" + time + '\'' +
               '}';
    }
}
