
public class ArticleLuxe extends Article {
	
	public ArticleLuxe(int resp_numéro, String nomdelarticle, double prixHT, int la_quantité_actuelle_en_stock) {
        super(resp_numéro,nomdelarticle,prixHT,la_quantité_actuelle_en_stock);
    }

    @Override
    public double prixTTC() {
        return super.prixTTC() * 1.15; // TVA à 15% (25% de TVA + 15%)
    }
}
