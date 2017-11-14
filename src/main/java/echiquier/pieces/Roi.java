package echiquier.pieces;

import echiquier.CouleurJeu;
import echiquier.pieces.deplacement.PositionPiece;

public class Roi extends Piece {

	public Roi(CouleurJeu couleur) {
		super(couleur);
	}

	@Override
	public PositionPiece obtenirPositionDeBaseBlanche() {
		return new PositionPiece(1, 4);
	}

}
