import Decorators.Email_Notification;
import Decorators.Push_Notification;
import Notifiers.SMS_Notifier;

public class NotificationSystem {
    public static void main(String[] args){
        SMS_Notifier smsNotifier = new SMS_Notifier();
        Email_Notification emailNotification = new Email_Notification(smsNotifier);
        Push_Notification pushNotification = new Push_Notification(emailNotification);

        pushNotification.notifySystem("Your OTP is 12345");
    }


}
