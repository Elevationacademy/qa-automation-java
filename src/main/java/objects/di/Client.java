package objects.di;

public class Client {
    public static void main(String[] args) {
        SomeService someService = new SomeService(new SMSNotificationService());
        someService.sendNotification("This is a test");
    }
}
