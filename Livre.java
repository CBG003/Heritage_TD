package ex3;

public class Livre {

    protected String titre;
    protected int identifiant;
    protected final double tva = 0.10;
    protected String domaine;
    protected int nbPages;
    
	public Livre(String titre, int identifiant, String domaine, int nbPages) {
		this.setTitre(titre);
		this.setIdentifiant(identifiant);
		this.setDomaine(domaine);
		this.setNbPages(nbPages);
	}

	public double calculePrix() {
		return ((0.075 * this.nbPages)*(1+ tva));
	}
	
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName()+", titre=" + this.getTitre() 
		+ ", identifiant=" + this.getIdentifiant() + 
		", domaine=" + this.getDomaine() + 
		", nbPages="+ this.getNbPages();
	}

	protected String getTitre() {
		return titre;
	}

	protected void setTitre(String titre) {
		this.titre = titre;
	}

	protected int getIdentifiant() {
		return identifiant;
	}

	protected void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	protected String getDomaine() {
		return domaine;
	}

	protected void setDomaine(String domaine) {
		this.domaine = domaine;
	}

	protected int getNbPages() {
		return nbPages;
	}

	protected void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}

	
}
