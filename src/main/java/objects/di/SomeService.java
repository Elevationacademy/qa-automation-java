package objects.di;

public class SomeService {
    private NotificationService notificationService;

    public SomeService(NotificationService notificationService) {
        this.notificationService = notificationService;

    }

    public void sendNotification(String text){
        notificationService.sendNotification(text);
    }
}
