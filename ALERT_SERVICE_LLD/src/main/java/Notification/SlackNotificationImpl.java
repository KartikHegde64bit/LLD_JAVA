package Notification;

import dto.Alert;
import dto.Developer;

public class SlackNotificationImpl implements INotification {
    public void notify(Developer developer, Alert alert){
        System.out.println("Slack Notification: " + developer.getName());
        System.out.println("Subject: " + alert.getMessage());
    }
}
