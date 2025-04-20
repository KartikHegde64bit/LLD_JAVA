package Decorators;

import Notifiers.Notifier;
import Notifiers.SMS_Notifier;

public abstract class NotifierDecorator implements Notifier {
    protected Notifier notifier;

    public NotifierDecorator(Notifier notifier){
        this.notifier = notifier;
    }

    public void notifySystem(String message){
        notifier.notifySystem(message);
    }
}
