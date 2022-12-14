
public class Game {
  // Fields for the board, players, and current player
  private Board board;
  private Player[] players;
  private Player currentPlayer;

  // Constructor for the Game class
  public Game(Player player1, Player player2) {
    // Initialize the board
    board = new Board();
    board.initialize();

    // Initialize the players
    players = new Player[2];
    players[0] = player1;
    players[1] = player2;

    // Set the current player to player 1
    currentPlayer = player1;
  }

  // Method to start the game
  public void start() {
    // Main game loop
    while (true) {
      // Print the board
      board.print();

      // Prompt the current player to make a move
      Move move = currentPlayer.makeMove();

      // Update the board with the move
      board.movePiece(move.getX1(), move.getY1(), move.getX2(), move.getY2());

      // Switch the current player
      currentPlayer = (currentPlayer == players[0]) ? players[1] : players[0];
    }
  }
}

