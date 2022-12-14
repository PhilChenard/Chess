import java.awt.Color;

public class Piece {
	  // Fields for the piece's type, color, and position
	  private String type;
	  private Color color;
	  private int x;
	  private int y;

	  // Constructor for the Piece class
	  public Piece(String type, Color color, int x, int y) {
	    this.type = type;
	    this.color = color;
	    this.x = x;
	    this.y = y;
	  }

	  // Getter and setter methods for the fields
	  public String getType() {
	    return type;
	  }

	  public void setType(String type) {
	    this.type = type;
	  }

	  public Color getColor() {
	    return color;
	  }

	  public void setColor(Color color) {
	    this.color = color;
	  }

	  public int getX() {
	    return x;
	  }

	  public void setX(int x) {
	    this.x = x;
	  }

	  public int getY() {
	    return y;
	  }

	  public void setY(int y) {
	    this.y = y;
	  }
	}

