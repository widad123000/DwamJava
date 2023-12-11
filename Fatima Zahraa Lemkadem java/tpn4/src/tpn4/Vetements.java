package tpn4;

public class Vetements extends Article {
	private String taille ;
	private String couleur ; 
	
	public Vetements() {
	}
	
	public Vetements(int numero , String designation , double prix , int qte  , String taille , String couleur ) {
		super(numero , designation , prix , qte);
		this.taille= taille ; 
		this.couleur=couleur;
	}

	public String getTaille() {
		return taille;
	}

	public void setTaille(String taille) {
		this.taille = taille;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	
}
