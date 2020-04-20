/**
 * 
 */
package chess;

import board.Board;
import board.Piece;
import board.Position;

/**
 * @author dailson
 *
 */
public abstract class ChessPiece extends Piece {
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return this.color;
	}

	/**
	 * @param position
	 * @return
	 */
	protected boolean isThereOppnentPice(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != this.color;
	}

}
