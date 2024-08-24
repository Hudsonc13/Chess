package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.Rook;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}
	
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getLinha()][board.getColuna()];
		for(int i=0;i<board.getLinha(); i++)
			for(int j=0;j<board.getColuna();j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		return mat;
	}
	
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(2,1));
	}
	
	

}
