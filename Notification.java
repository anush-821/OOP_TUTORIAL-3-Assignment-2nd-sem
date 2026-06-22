public interface Notification {
    void sendNotification(String recipient, String message);
}

class EmailNotification implements Notification {
    @Override
    public void sendNotification(String recipient, String message) {
        System.out.println("Sending Email to " + recipient + ": " + message);
    }
}

class SMSNotification implements Notification {
    @Override
    public void sendNotification(String recipient, String message) {
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }
}