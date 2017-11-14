package echiquier.pieces.deplacement;

public class DeplacementPiece {
	private PositionPiece debut;
	private PositionPiece fin;
	
	public DeplacementPiece(int i, int j, int k, int l) {
		this.debut = new PositionPiece(i, j);
		this.fin = new PositionPiece(k, l);
	}

	public PositionPiece getDebut() {
		return debut;
	}

	public PositionPiece getFin() {
		return fin;
	}
	
	public String toString() {
		return debut.toString() + " -> " + fin.toString();
	}
}
