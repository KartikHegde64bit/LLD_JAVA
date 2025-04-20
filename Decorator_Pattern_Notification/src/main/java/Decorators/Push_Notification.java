package Decorators;

import Notifiers.Notifier;

public class Push_Notification extends NotifierDecorator {
    String type = "Push Notification: ";
    //protected Notifier notifier;

    public Push_Notification(Notifier notifier){
        super(notifier);
    }
    public void notifySystem(String message){
        notifier.notifySystem(message);
        System.out.println(type + message);
    }
}
