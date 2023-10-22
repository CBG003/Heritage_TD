package ex3;

public class Magazine extends Livre {

	 private String moisParution;
	
	public Magazine(String titre, int identifiant, String domaine, int nbPages, String moisParution ) {
		super(titre, identifiant, domaine, nbPages);
		this.setMoisParution(moisParution);
	}

	
	
	
	@Override
	public String toString() {
		return super.toString()+" , Mois Parution=" + this.getMoisParution();
	}


	public double calculePrix(int bonus) {
		return ((0.35 * nbPages)*(1+tva)+bonus);
	}

	public String getMoisParution() {
		return moisParution;
	}

	public void setMoisParution(String moisParution) {
		this.moisParution = moisParution;
	}

}
