package objects.di;

public class SMSNotificationService implements NotificationService{
    @Override
    public void sendNotification(String text) {
        System.out.println("Sending SMS with this text: "+ text);
    }
}
