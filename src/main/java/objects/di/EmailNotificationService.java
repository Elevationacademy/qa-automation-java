package objects.di;

public class EmailNotificationService implements NotificationService{

    @Override
    public void sendNotification(String text) {
        System.out.println("Sending "+ text + " via Email");
    }
}
