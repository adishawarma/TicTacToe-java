import java.util.*;

class TicTacToe {

    char[][] board = new char[3][3];

    public TicTacToe(char[][] board) {
        this.board = board;
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" - ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] board = new char[3][3];

        TicTacToe tictactoe = new TicTacToe(board);
        tictactoe.printBoard();

    }
}
