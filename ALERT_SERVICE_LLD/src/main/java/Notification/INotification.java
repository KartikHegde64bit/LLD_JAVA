package Notification;

import dto.Alert;
import dto.Developer;

public interface INotification {
    void notify(Developer developer, Alert alert);
}
