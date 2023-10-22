package ex3;

public class Roman extends Livre {

    private String auteur;
    private String editeur;
    
	public Roman(String titre, int identifiant, String domaine, int nbPages, String auteur, String editeur  ) {
		super(titre, identifiant, domaine, nbPages);
		this.setAuteur(auteur);
		this.setEditeur(editeur);
	}
	
	
	
	

	public String getAuteur() {
		return auteur;
	}

	@Override
	public String toString() {
		return super.toString()+", auteur=" + this.getAuteur() + ", editeur=" + this.getEditeur() ;
	}

	@Override
	public double calculePrix() {
		return ((0.05 * this.nbPages)*(1+ tva));
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getEditeur() {
		return editeur;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}
	

}
