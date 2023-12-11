package tpn4;

public class Article {
	private int numero ; 
	private String designation ; 
	private double prix ; 
	private int qte ; 
	
	
	public Article() {
		
	}

	public Article ( int numero , String designation , double prix , int qte ) {
		this.numero= numero; 
		this.designation= designation ; 
		this.prix=prix;
		this.qte=qte;
	}
	
	public void setNumero(int n) {
		numero = n;
	}
	public int getNumero() {
		return numero ;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}
	
	public double prixTTc() {
		return prix * ( 1+0.25);
	}
	
	public double afficherPrix(Article a) {
	 return a.getPrix();
	}
	
	
}
