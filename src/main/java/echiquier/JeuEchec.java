package echiquier;

import echiquier.pieces.deplacement.DeplacementPiece;

public class JeuEchec {
	private Echiquier echiquier;
	
	public JeuEchec() {
		this.echiquier = new Echiquier();
	}
	
	public void jouer() {
		System.out.println(this.echiquier.toString());
		
		// joueur Blanc
		DeplacementPiece dp = new DeplacementPiece(1, 5, 2, 5);
		this.echiquier.deplacerPieceBlanche(dp);
		// joueur Noir
		DeplacementPiece dp2 = new DeplacementPiece(8, 4, 7, 5);
		this.echiquier.deplacerPieceNoir(dp2);
		
		System.out.println(this.echiquier.toString());
	}
}
