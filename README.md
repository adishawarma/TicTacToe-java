# Tic Tac Toe Game in Java

This is a simple console-based implementation of the classic **Tic Tac Toe** game, built in Java. The game allows two players to take turns and compete by placing their respective markers (`X` or `O`) on a 3x3 board. The player who succeeds in placing three of their marks in a horizontal, vertical, or diagonal row wins the game.

## Features

- Two-player mode: Player `X` and Player `O`
- Players take turns to enter their moves
- The game checks for a win after every move
- Displays the board after each player's move
- Validates moves to ensure players cannot override existing marks or play out of bounds
- Declares the winner or a draw if all cells are filled

## How to Play

1. The game starts with an empty 3x3 board.
2. Players take turns entering their moves by specifying the row and column numbers (0, 1, or 2) where they want to place their mark.
3. The game continues until a player wins by aligning three of their marks horizontally, vertically, or diagonally, or until the board is full (resulting in a draw).

### Example Board

| X     | O     | X     |
| ----- | ----- | ----- |
| **O** | **X** | **O** |
|       |       | **X** |

## Code Overview

### Classes

1. **TicTacToe**

   - Manages the game board, player turns, and move validation.
   - Handles checking for a win or draw after every move.

2. **Main**

   - Contains the `main()` method to start the game.

### Methods

- **`public void printBoard()`**: Displays the current state of the board.
- **`public void setStringX(int row, int column)`**: Sets the player's mark "X" on the board.
- **`public void setStringO(int row, int column)`**: Sets the player's mark "O" on the board.
- **`public boolean checkWin(int row, int column, String move)`**: Checks if the current move results in a win.
- **`private boolean isValidMove(int row, int column)`**: Validates the move to ensure the position is empty and within the board limits.
- **`public void startGame()`**: Main game loop to handle player inputs, move validation, and determine the game outcome.

## How to Run

Clone the repository or download the code to your local machine.

```bash
git clone https://github.com/adishawarma/TicTacToe-java.git
cd TicTacToe-java
javac Main.java
java Main
```

Enter your moves in the format: row column (e.g., 0 1 for the top middle position).

## Future Improvements

- Implement a single-player mode with AI for player vs computer.
- Add a graphical user interface (GUI) to improve user experience.

## Contributing

Contributions are welcome! Feel free to fork the repository and submit pull requests to improve the game or fix any issues.

## License

This project is licensed under the [MIT License](https://github.com/adishawarma/TicTacToe-java/blob/main/LICENSE). See the LICENSE file for details.
