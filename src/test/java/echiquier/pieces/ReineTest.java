package echiquier.pieces;

import static org.junit.Assert.*;

import org.junit.Test;

import echiquier.CouleurJeu;

public class ReineTest {

	@Test
	public void testObtenirPositionDeBaseBlanche() {
		PiecesEnJeu pjeu = new PiecesEnJeu(CouleurJeu.Blanc);
		Piece p = pjeu.obtenirReine();
		
		assertArrayEquals("La position de la reine n'est pas correcte.", new Integer[] {1, 5}, new Integer[] {p.obtenirRangee(), p.obtenirColonne()});
	}

	@Test
	public void testObtenirPositionDeBaseNoire() {
		PiecesEnJeu pjeu = new PiecesEnJeu(CouleurJeu.Noir);
		Piece p = pjeu.obtenirReine();
		
		assertArrayEquals("La position de la reine n'est pas correcte.", new Integer[] {8, 4}, new Integer[] {p.obtenirRangee(), p.obtenirColonne()});
	}

}
