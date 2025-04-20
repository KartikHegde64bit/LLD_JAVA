package Notifiers;

public class SMS_Notifier implements Notifier{
    String type = "SMS Notification: ";
    public void notifySystem(String message){
        System.out.println(type + message);
    }
}
