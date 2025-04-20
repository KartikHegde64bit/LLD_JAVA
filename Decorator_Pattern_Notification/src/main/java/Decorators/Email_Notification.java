package Decorators;

import Notifiers.Notifier;

public class Email_Notification extends NotifierDecorator {
    String type = "Email Notification: ";
    //protected Notifier notifier;
    public Email_Notification(Notifier notifier){
        super(notifier);
    }
    public void notifySystem(String message){
        notifier.notifySystem(message);
        System.out.println("Email Notification: " + message);
    }
}
