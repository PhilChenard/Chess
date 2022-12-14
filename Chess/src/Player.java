import java.awt.Color;
import java.util.Scanner;



public class Player {
  // Fields for the player's name and color
  private String name;
  private Color color;

  // Constructor for the Player class
  public Player(String name, Color color) {
    this.name = name;
    this.color = color;
  }

  // Method for the player to make a move
  public Move makeMove() {
    // Prompt the player to enter a move
    System.out.println(name + ", enter your move (x1 y1 x2 y2):");

    // Read the move from the input
    Scanner scanner = new Scanner(System.in);
    int x1 = scanner.nextInt();
    int y1 = scanner.nextInt();
    int x2 = scanner.nextInt();
    int y2 = scanner.nextInt();

    // Return a new Move object with the input values
    return new Move(x1, y1, x2, y2);
  }
}