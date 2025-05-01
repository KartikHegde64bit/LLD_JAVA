package Notification;

import dto.Alert;
import dto.Developer;

public class SMSNotificationImpl implements INotification {
    public void notify(Developer developer, Alert alert){
        System.out.println("SMS Notification has been sent to: " + developer.getName());
        System.out.println("Subject: " + alert.getMessage());
    }
}
