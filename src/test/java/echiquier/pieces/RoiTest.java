package echiquier.pieces;

import static org.junit.Assert.*;

import org.junit.Test;

import echiquier.CouleurJeu;

public class RoiTest {

	@Test
	public void testObtenirPositionDeBaseBlanche() {
		PiecesEnJeu pjeu = new PiecesEnJeu(CouleurJeu.Blanc);
		Piece p = pjeu.obtenirRoi();
		
		assertArrayEquals("La position de la reine n'est pas correcte.", new Integer[] {1, 4}, new Integer[] {p.obtenirRangee(), p.obtenirColonne()});
	}

	@Test
	public void testObtenirPositionDeBaseNoire() {
		PiecesEnJeu pjeu = new PiecesEnJeu(CouleurJeu.Noir);
		Piece p = pjeu.obtenirRoi();
		
		assertArrayEquals("La position de la reine n'est pas correcte.", new Integer[] {8, 5}, new Integer[] {p.obtenirRangee(), p.obtenirColonne()});
	}

}
