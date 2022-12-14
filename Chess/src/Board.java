import java.awt.Color;

public class Board {
	
		  // Two-dimensional array of Piece objects to represent the board
		  private Piece[][] board;

		  // Initialize the board with the starting positions of the pieces
		  public void initialize() {
		    // Initialize the board array
		    board = new Piece[8][8];

		    // Add the white pieces
		    board[0][0] = new Piece("Rook", Color.WHITE, 0, 0);
		    board[0][1] = new Piece("Knight", Color.WHITE, 0, 1);
		    board[0][2] = new Piece("Bishop", Color.WHITE, 0, 2);
		    board[0][3] = new Piece("Queen", Color.WHITE, 0, 3);
		    board[0][4] = new Piece("King", Color.WHITE, 0, 4);
		    board[0][5] = new Piece("Bishop", Color.WHITE, 0, 5);
		    board[0][6] = new Piece("Knight", Color.WHITE, 0, 6);
		    board[0][7] = new Piece("Rook", Color.WHITE, 0, 7);
		    for (int i = 0; i < 8; i++) {
		      board[1][i] = new Piece("Pawn", Color.WHITE, 1, i);
		    }

		    // Add the black pieces
		    board[7][0] = new Piece("Rook", Color.BLACK, 7, 0);
		    board[7][1] = new Piece("Knight", Color.BLACK, 7, 1);
		    board[7][2] = new Piece("Bishop", Color.BLACK, 7, 2);
		    board[7][3] = new Piece("Queen", Color.BLACK, 7, 3);
		    board[7][4] = new Piece("King", Color.BLACK, 7, 4);
		    board[7][5] = new Piece("Bishop", Color.BLACK, 7, 5);
		    board[7][6] = new Piece("Knight", Color.BLACK, 7, 6);
		    board[7][7] = new Piece("Rook", Color.BLACK, 7, 7);
		    for (int i = 0; i < 8; i++) {
		      board[6][i] = new Piece("Pawn", Color.BLACK, 6, i);
		    }
		  }

		  // Get the piece at the given position
		  public Piece getPiece(int x, int y) {
		    return board[x][y];
		  }

		  // Move the piece at the given position to the new position
		  public void movePiece(int x1, int y1, int x2, int y2) {
		    // Get the piece at the starting position
		    Piece piece = board[x1][y1];

		    // Update the piece's position
		    piece.setX(x2);
		    piece.setY(y2);

		    // Update the board array
		    board[x2][y2] = piece;
		    board[x1][y1] = null;
		  }

		public void print() {
			// TODO Auto-generated method stub
				  // Loop through the rows and columns of the board
				  for (int i = 0; i < 8; i++) {
				    for (int j = 0; j < 8; j++) {
				      // Get the piece at the current position
				      Piece piece = board[i][j];

				      // If there is no piece at the position, print a space
				      if (piece == null) {
				        System.out.print(" ");
				      }
				      // If there is a piece at the position, print the piece's symbol
				      else {
				        // Get the piece's type and color
				        String type = piece.getType();
				        Color color = piece.getColor();

				        // If the piece is a pawn, print "P" for white pieces and "p" for black pieces
				        if (type.equals("Pawn")) {
				          System.out.print(color == Color.WHITE ? "P" : "p");
				        }
				        // If the piece is a knight, print "N" for white pieces and "n" for black pieces
				        else if (type.equals("Knight")) {
				          System.out.print(color == Color.WHITE ? "N" : "n");
				        }
				        // If the piece is a bishop, print "B" for white pieces and "b" for black pieces
				        else if (type.equals("Bishop")) {
				          System.out.print(color == Color.WHITE ? "B" : "b");
				        }
				        // If the piece is a rook, print "R" for white pieces and "r" for black pieces
				        else if (type.equals("Rook")) {
				          System.out.print(color == Color.WHITE ? "R" : "r");
				        }
				        // If the piece is a queen, print "Q" for white pieces and "q" for black pieces
				        else if (type.equals("Queen")) {
				          System.out.print(color == Color.WHITE ? "Q" : "q");
				        }
				        // If the piece is a king, print "K" for white pieces and "k" for black pieces
				        else if (type.equals("King")) {
				          System.out.print(color == Color.WHITE ? "K" : "k");
				        }
				      }
				    }

				    // After each row, print a newline character
				    System.out.println();
				  }
				}

			
		}
		

