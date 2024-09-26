import java.util.*;

class TicTacToe {

    String[][] board = new String[3][3];
    Scanner sc = new Scanner(System.in);

    public TicTacToe() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = " - ";
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public void setStringX(int row, int column) {
        board[row][column] = " X ";
    }

    public void setStringO(int row, int column) {
        board[row][column] = " O ";
    }

    public boolean checkWin(int row, int column, String move) {
        int v = 3 * (row) + column;
        if ((v == 0) || (v == 2) || (v == 4) || (v == 6) || (v == 8)) {
            if ((board[0][0] == move) && (board[1][1] == move) && (board[2][2] == move)) {
                return true;
            } else if ((board[0][2] == move) && (board[1][1] == move) && (board[2][0] == move)) {
                return true;
            }
        }

        if ((board[row][0] == board[row][1]) && (board[row][1] == board[row][2]) && (board[row][0] == move)) {
            return true;
        } else if ((board[0][column] == board[1][column]) && (board[0][column] == board[2][column])
                && (board[0][column] == move)) {
            return true;
        }

        return false;

    }

    public void startGame() {
        int count = 9;
        int row, column;

        printBoard();

        while (count > 0) {

            if (count % 2 == 0) {
                System.out.println("Enter your move player O: ");
                row = sc.nextInt();
                column = sc.nextInt();
                if (isValidMove(row, column)) {
                    setStringO(row, column);
                    printBoard();
                    count--;
                } else {
                    System.out.println("Enter a valid move!");
                }
            } else if (count % 2 != 0) {
                System.out.println("Enter your move player X: ");
                row = sc.nextInt();
                column = sc.nextInt();
                if (isValidMove(row, column)) {
                    setStringX(row, column);
                    printBoard();
                    count--;
                } else {
                    System.out.println("Enter a valid move!");

                }
            }
        }
    }

    private boolean isValidMove(int row, int column) {
        if ((row >= 0 && row < 3) && (column >= 0 && column < 3) && (board[row][column].equals(" - "))) {
            return true;
        } else {
            return false;
        }
    }

}

public class Main {
    public static void main(String[] args) {

        TicTacToe tictactoe = new TicTacToe();
        tictactoe.startGame();
    }

}
