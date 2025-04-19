package Managers;

import dto.Board;
import dto.User;
import enums.BoardStatus;

import java.util.Scanner;

public class BoardManager {
    private static Board board = new Board();

    public static Board getBoard() {
        if (board.getBoardStatus() == BoardStatus.FREE) {
            return board;
        }
        return null;
    }

    public static void playGame(Board board, User user1, User user2) {
        Scanner scanner = new Scanner(System.in);
        User currentUser = user1;
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
            board.printBoard();

            if (board.checkWinner(currentUser.getSymbol())) {
                System.out.println(currentUser.getName() + " wins!");
                board.setBoardStatus(BoardStatus.ENDED);
                break;
            }

            if (board.isDraw()) {
                System.out.println("Game is a draw!");
                board.setBoardStatus(BoardStatus.ENDED);
                break;
            }

            // switch turns
            currentUser = (currentUser == user1) ? user2 : user1;
        }
    }
}
