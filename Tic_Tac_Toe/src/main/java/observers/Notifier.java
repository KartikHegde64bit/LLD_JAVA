package observers;

import enums.BoardStatus;

public interface Notifier {
    void notifyMove(Character ch);

    void notifyGameState(BoardStatus status);
}
