package observers;

import enums.BoardStatus;

public class pushNotifier implements Notifier {
    public void notifyMove(Character ch){
        System.out.println("Push Notification: Move :" + ch + "has been made");
    }

    public void notifyGameState(BoardStatus status){
        System.out.println("Push Notification: Game state has been changed to: " + status);
    }
}
