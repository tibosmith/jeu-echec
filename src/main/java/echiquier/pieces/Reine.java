package echiquier.pieces;

import echiquier.CouleurJeu;
import echiquier.pieces.deplacement.PositionPiece;

public class Reine extends Piece {

	public Reine(CouleurJeu couleur) {
		super(couleur);
	}

	@Override
	public PositionPiece obtenirPositionDeBaseBlanche() {
		return new PositionPiece(1, 5);
	}

}
