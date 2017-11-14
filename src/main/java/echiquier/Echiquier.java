package echiquier;

import java.util.ArrayList;
import java.util.List;

import echiquier.pieces.Piece;
import echiquier.pieces.PiecesEnJeu;
import echiquier.pieces.deplacement.DeplacementPiece;

public class Echiquier {
	
	private List<PiecesEnJeu> piecesDuJeu;
	private List<PiecesEnJeu> piecesMortes;
	
	public Echiquier() {
		this.piecesDuJeu = new ArrayList<PiecesEnJeu>();
		this.piecesMortes = new ArrayList<PiecesEnJeu>();

		this.piecesDuJeu.add(new PiecesEnJeu(CouleurJeu.Blanc));
		this.piecesDuJeu.add(new PiecesEnJeu(CouleurJeu.Noir));
	}

	public void deplacerPieceBlanche(DeplacementPiece dp) {
		PiecesEnJeu blanc = this.piecesDuJeu.get(0);
		blanc.deplacerUnePiece(dp);
		
	}

	public void deplacerPieceNoir(DeplacementPiece dp) {
		PiecesEnJeu noir = this.piecesDuJeu.get(1);
		noir.deplacerUnePiece(dp);
	}

	public boolean aucunRoiEnEchecEtMat() {
		return false;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(PiecesEnJeu pj : this.piecesDuJeu) {
			for(Piece p : pj.getPieces()) {
				sb.append(p.toString() + "\n");
			}
		}
		
		return sb.toString();
	}

}
