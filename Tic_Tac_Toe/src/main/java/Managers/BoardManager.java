package Managers;

import dto.Board;
import dto.User;
import enums.BoardStatus;
import observers.Notifier;
import observers.pushNotifier;
import observers.smsNotifier;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BoardManager {
    private static Board board = new Board();
    private static List<Notifier> observers = Arrays.asList(new pushNotifier(), new smsNotifier());
    public static Board getBoard() {
        if (board.getBoardStatus() == BoardStatus.FREE) {
            return board;
        }
        return null;
    }

    public static void playGame(Board board, User user1, User user2) {
        Scanner scanner = new Scanner(System.in);
        board.setCurrentUser(user1);

        User currentUser = board.getCurrentUser();
        board.printBoard();

        while (board.getBoardStatus() == BoardStatus.IN_PROGRESS) {
            System.out.println(currentUser.getName() + "'s turn (" + currentUser.getSymbol() + ")");

            System.out.print("Enter row: ");
            int row = scanner.nextInt();
            System.out.print("Enter col: ");
            int col = scanner.nextInt();

            if (!board.isMoveValid(row, col)) {
                System.out.println("Invalid move. Try again.");
                continue;
            }

            board.makeMove(row, col, currentUser.getSymbol());
            notifyObservers("move", currentUser, board);
            board.printBoard();

            if (board.checkWinner(currentUser.getSymbol())) {
                System.out.println(currentUser.getName() + " wins!");
                notifyObservers("gameStatus", currentUser, board);
                board.setBoardStatus(BoardStatus.ENDED);
                break;
            }

            if (board.isDraw()) {
                System.out.println("Game is a draw!");
                notifyObservers("gameStatus", currentUser, board);
                board.setBoardStatus(BoardStatus.ENDED);
                break;
            }

            // switch turns
            currentUser = (currentUser == user1) ? user2 : user1;
            board.setCurrentUser(currentUser);
        }
    }

    public static void notifyObservers(String type, User currentUser, Board board){
        if(type == "move"){
            // notify all the observers
            for(Notifier obs: observers){
                obs.notifyMove(currentUser.getSymbol());
            }
        } else {
            // notify all the observers
            for(Notifier obs: observers){
                obs.notifyGameState(board.getBoardStatus());
            }
        }

    }
}
