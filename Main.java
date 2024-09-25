import java.util.*;

class TicTacToe {

    String[][] board = new String[3][3];

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

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TicTacToe tictactoe = new TicTacToe();
        tictactoe.printBoard();

        int count = 9;

        while (count != 0) {

            if (count % 2 == 0) {
                int row = sc.nextInt();
                int column = sc.nextInt();
                tictactoe.setStringX(row, column);
                tictactoe.printBoard();
                count--;
            } else if (count % 2 != 0) {
                int row = sc.nextInt();
                int column = sc.nextInt();
                tictactoe.setStringO(row, column);
                tictactoe.printBoard();
                count--;
            }

        }

        // tictactoe.printBoard();

        // tictactoe.setStringX(row, column);
        // // tictactoe.printBoard();
        // tictactoe.printBoard();

        sc.close();

    }
}
