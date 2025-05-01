package Services;

import Notification.INotification;
import dto.Alert;
import dto.Developer;

public class NotificationService {
    private INotification slackNotification;
    private INotification smsNotification;

    public NotificationService(INotification smsNotification, INotification slackNotification){
        this.smsNotification = smsNotification;
        this.slackNotification = slackNotification;
    }

    public void sendSlackAndSmsNotification(Developer developer, Alert alert){
        slackNotification.notify(developer, alert);
        smsNotification.notify(developer, alert);
    }

    public void sendSmsNotification(Developer developer, Alert alert){
        smsNotification.notify(developer, alert);
    }

    public void sendSlackNotification(Developer developer, Alert alert){
        slackNotification.notify(developer, alert);
    }
}
