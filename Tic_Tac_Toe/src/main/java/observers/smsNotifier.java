package observers;

import enums.BoardStatus;

public class smsNotifier implements Notifier {
    public void notifyMove(Character ch){
        System.out.println("SMS Notification: Move :" + ch + "has been made");
    }

    public void notifyGameState(BoardStatus status){
        System.out.println("SMS Notification: Game state has been changed to: " + status);
    }
}
