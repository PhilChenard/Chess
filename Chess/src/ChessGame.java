

import java.awt.*;
import javax.swing.*;

	public class ChessGame {
	  public static void main(String[] args) {
	    // Create the game board
	    Board board = new Board();

	    // Create the GUI frame and panel
	    JFrame frame = new JFrame("Chess");
	    JPanel panel = new JPanel();

	    // Set the layout manager for the panel
	    panel.setLayout(new GridLayout(8, 8));

	    // Add the squares to the panel
	    for (int i = 0; i < 8; i++) {
	      for (int j = 0; j < 8; j++) {
	        // Get the piece at position (i, j)
	        Piece piece = board.getPiece(i, j);

	        // Create a button for the square
	        JButton button = new JButton();

	        // Set the background color of the button
	        if ((i + j) % 2 == 0) {
	          button.setBackground(Color.WHITE);
	        } else {
	          button.setBackground(Color.BLACK);
	        }

	        // If there is a piece on the square, add a label to the button
	        if (piece != null) {
	          JLabel label = new JLabel(piece.getType());
	          label.setForeground(piece.getColor());
	          button.add(label);
	        }

	        // Add the button to the panel
	        panel.add(button);
	      }
	    }

	    // Add the panel to the frame
	    frame.add(panel);

	    // Set the size of the frame and make it visible
	    frame.setSize(500, 500);
	    frame.setVisible(true);
	  }
	}


