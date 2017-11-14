package echiquier.pieces;

import echiquier.CouleurJeu;
import echiquier.pieces.deplacement.DeplacementPiece;
import echiquier.pieces.deplacement.PositionPiece;

public abstract class Piece {
	protected PositionPiece position;
	protected CouleurJeu couleur;

	public Piece(CouleurJeu couleur) {
		this.couleur = couleur;
		if (couleur.equals(CouleurJeu.Blanc)) {
			this.position = this.obtenirPositionDeBaseBlanche();
		} else {
			this.position = this.obtenirPositionDeBaseNoire();
		}
	}
	
	public abstract PositionPiece obtenirPositionDeBaseBlanche();
	public PositionPiece obtenirPositionDeBaseNoire() {
		return this.obtenirPositionDeBaseBlanche().obtenirPositionSymetrique();
	}
	
	public PositionPiece obtenirPosition() {
		return this.position;
	}
	
	public Integer obtenirColonne() {
		return this.position.getColonne();
	}
	
	public Integer obtenirRangee() {
		return this.position.getRangee();
	}
	
	public String toString() {
		return this.getClass().getName() + " " + this.couleur + " : (" + this.position.getRangee() + ", " + this.position.getColonne() + ")";
	}

	public PositionPiece getPosition() {
		return position;
	}

	public boolean coupValide(PositionPiece fin) {
		return true;
	}

	public void faireDeplacement(DeplacementPiece dp) {
		this.position = dp.getFin();
	}
}
