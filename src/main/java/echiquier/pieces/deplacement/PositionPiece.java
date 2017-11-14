package echiquier.pieces.deplacement;

public class PositionPiece {
	private Integer colonne;
	private Integer rangee;
	
	public PositionPiece(Integer rangee, Integer colonne) {
		this.colonne = colonne;
		this.rangee = rangee;
	}

	public Integer getColonne() {
		return colonne;
	}

	public void setColonne(Integer colonne) {
		this.colonne = colonne;
	}

	public Integer getRangee() {
		return rangee;
	}

	public void setRangee(Integer rangee) {
		this.rangee = rangee;
	}

	public PositionPiece obtenirPositionSymetrique() {
		Integer symetriqueColonne = Math.abs(4 - this.colonne);
		if (this.colonne >= 4) {
			symetriqueColonne = 4 - symetriqueColonne + 1;
		} else {
			symetriqueColonne = 4 + symetriqueColonne + 1;
		}
		
		Integer symetriqueRangee = Math.abs(4 - this.rangee);

		if (this.rangee >= 4) {
			symetriqueRangee = 4 - symetriqueRangee + 1;
		} else {
			symetriqueRangee = 4 + symetriqueRangee + 1;
		}
		
		return new PositionPiece(symetriqueRangee, symetriqueColonne);
	}
	
	public boolean equals(Object o) {
		if (o instanceof PositionPiece) {
			PositionPiece pp = (PositionPiece) o;
			return (this.colonne.equals(pp.getColonne()) && this.rangee.equals(pp.getRangee()));
		}
		
		return false;
	}
	
	public String toString() {
		return "(" + this.rangee + ", " + this.colonne + ")";
	}
	
}
 