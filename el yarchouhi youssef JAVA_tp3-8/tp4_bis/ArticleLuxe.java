package tp4_bis;

public class ArticleLuxe extends Article {


    // construcotr
    public ArticleLuxe(){
        super();
    }
    public ArticleLuxe(int n, String m, double p, int q){
        super(n,m,p,q);
    }


    @Override
    public double prixTTC(){
        return getPrixHT() + (getPrixHT()*0.25);
    }
}
