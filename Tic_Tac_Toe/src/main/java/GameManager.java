import dto.Board;
import dto.User;
import Managers.UserManager;
import Managers.BoardManager;

public class GameManager {
    public static void main(String[] args) {
        User user1 = UserManager.createUser("Kartik", 'X');
        User user2 = UserManager.createUser("Vivek", 'O');

        Board board = BoardManager.getBoard();
        if (board == null) {
            System.out.println("No available board to start the game.");
            return;
        }

        board.setBoardStatus(enums.BoardStatus.IN_PROGRESS);
        BoardManager.playGame(board, user1, user2);
    }
}
