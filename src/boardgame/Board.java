package boardgame;

public class Board {
	
	private int coluna;
	private int linha;
	protected Piece[][] pieces;
	
	public Board(int coluna, int linha) {
		this.coluna = coluna;
		this.linha = linha;
		pieces = new Piece[linha][coluna];
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}
	
	
	public Piece piece(int linha, int coluna){
		return pieces[linha][coluna];
		
	}
	
	public Piece piece(Position position) {
		return pieces[position.getLinha()][position.getColuna()];
	}
	
	

}
