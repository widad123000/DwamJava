
public class Article implements MonApi {
private int resp_numéro ;
private String nomdelarticle;
private double  prix_HT;
private int  la_quantité_actuelle_en_stock;


public Article () {
	this.resp_numéro=0;
	this.nomdelarticle="spécimen";
	this.prix_HT=1.1;
	this.la_quantité_actuelle_en_stock =222;
}

public Article(int n, String m, double p, int q) {
	this.resp_numéro = n;
	this.nomdelarticle=m;
	this.prix_HT=p;
	this.la_quantité_actuelle_en_stock = q;
}

public Article(Article a) {
	this.resp_numéro=a.resp_numéro;
	this.nomdelarticle=a.nomdelarticle;
	this.prix_HT=a.prix_HT;
	this.la_quantité_actuelle_en_stock =a.la_quantité_actuelle_en_stock;

}

public int getResp_numéro() {
	return resp_numéro;
}

public void setResp_numéro(int resp_numéro) {
	this.resp_numéro = resp_numéro;
}

public String getNomdelarticle() {
	return nomdelarticle;
}

public void setNomdelarticle(String nomdelarticle) {
	this.nomdelarticle = nomdelarticle;
}

public double getPrix_HT() {
	return prix_HT;
}

public void setPrix_HT(double prix_HT) {
	this.prix_HT = prix_HT;
}

public int getLa_quantité_actuelle_en_stock() {
	return la_quantité_actuelle_en_stock;
}

public void setLa_quantité_actuelle_en_stock(int la_quantité_actuelle_en_stock) {
	this.la_quantité_actuelle_en_stock = la_quantité_actuelle_en_stock;
}
public double prixTTC() {
    double tva = 1.25; // TVA à 25%
    return prix_HT * tva;
}

public void print() {
	System.out.println(convText());
	
}

public String convText() {
	String s = "{"+resp_numéro + ","+nomdelarticle
			+","+prix_HT+","+la_quantité_actuelle_en_stock+"}";
	return s;
}

public int Compare(Object o) {
	Article c = (Article)o;
	if(this.resp_numéro>c.resp_numéro) {
		return 1;
	}
		else if(this.resp_numéro<c.resp_numéro){
			return -1;
	}
		else {
			return 0;
		}
	
}

}
