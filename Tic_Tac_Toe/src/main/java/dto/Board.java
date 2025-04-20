package dto;

import enums.BoardStatus;

public class Board {
    private final int dimension = 3;
    private char[][] board;
    private BoardStatus boardStatus;
    private User currentUser = null;

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public Board() {
        this.board = new char[dimension][dimension];
        this.boardStatus = BoardStatus.FREE;
        // Initialize with empty values
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                board[i][j] = '-';
            }
        }
    }

    public BoardStatus getBoardStatus() {
        return boardStatus;
    }

    public void setBoardStatus(BoardStatus boardStatus) {
        this.boardStatus = boardStatus;
    }

    public void printBoard() {
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isMoveValid(int row, int col) {
        return row >= 0 && row < dimension &&
                col >= 0 && col < dimension &&
                board[row][col] == '-';
    }

    public void makeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    public boolean checkWinner(char symbol) {
        // Check rows and columns
        for (int i = 0; i < dimension; i++) {
            if ((board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) ||
                    (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)) {
                return true;
            }
        }

        // Check diagonals
        if ((board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
                (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)) {
            return true;
        }

        return false;
    }

    public boolean isDraw() {
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}
