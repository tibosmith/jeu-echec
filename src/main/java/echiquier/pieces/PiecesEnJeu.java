package echiquier.pieces;

import java.util.ArrayList;
import java.util.List;

import echiquier.CouleurJeu;
import echiquier.pieces.deplacement.DeplacementPiece;
import echiquier.pieces.deplacement.PositionPiece;

public class PiecesEnJeu {
	private CouleurJeu couleur;
	private List<Piece> pieces;
	
	public PiecesEnJeu(CouleurJeu couleur) {
		this.couleur = couleur;
		this.pieces = new ArrayList<Piece>();
		
		// Création des pièces du jeu
		this.ajoutPions();
		this.ajoutFoux();
		this.ajoutTours();
		this.ajoutCavaliers();
		this.ajoutRoiEtReine();
		
	}

	private void ajoutRoiEtReine() {
		Piece p1 = new Roi(this.couleur);
		this.pieces.add(p1);
		
		Piece p2 = new Reine(this.couleur);
		this.pieces.add(p2);
	}

	private void ajoutCavaliers() {
		// TODO Auto-generated method stub
		
	}

	private void ajoutTours() {
		// TODO Auto-generated method stub
		
	}

	private void ajoutFoux() {
		// TODO Auto-generated method stub
		
	}

	private void ajoutPions() {
		// TODO Auto-generated method stub
		
	}

	public Piece obtenirReine() {
		for(Piece p : this.pieces) {
			if (p instanceof Reine) {
				return p;
			}
		}
		
		return null;
	}
	
	public Piece obtenirPiece(PositionPiece p) {
		for (Piece p2 : this.pieces ) {
			if (p2.equals(p)) {
				return p2;
			}
		}
		return null;
	}

	public Piece obtenirRoi() {
		for(Piece p : this.pieces) {
			if (p instanceof Roi) {
				return p;
			}
		}
		
		return null;
	}
	
	public void deplacerUnePiece(DeplacementPiece dp) {
		for (Piece p : this.pieces) {
			if (p.getPosition().equals(dp.getDebut())) {
				
				if (p.coupValide(dp.getFin())) {
					p.faireDeplacement(dp);
				}
			}
		}
	}

	public List<Piece> getPieces() {
		return pieces;
	}

}
