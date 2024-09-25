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

    public void startGame() {
        int count = 9;
        int row, column;

        printBoard();

        while (count > 0) {

            if (count % 2 == 0) {
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
