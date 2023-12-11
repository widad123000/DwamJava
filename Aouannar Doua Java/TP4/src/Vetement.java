
public class Vetement extends Article {
	
	private int taille ;
	private String color;
	
	public Vetement(int resp_numéro, String nomdelarticle, double prixHT, int la_quantité_actuelle_en_stock , int taille , String color) {
        super(resp_numéro,nomdelarticle,prixHT,la_quantité_actuelle_en_stock);
        
    	this.taille=taille;
		this.color=color;
    }
	

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
