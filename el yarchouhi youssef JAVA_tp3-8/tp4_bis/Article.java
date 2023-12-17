package tp4_bis;

public class Article {
    private int number;
    private String designation; 
    private double prixHT;
    private int qte;
    // defult constracter
    public Article(){
        this(0, null, 0, 0);
    }
    // constracter
    public Article(int n, String m, double p, int q){
        this.number = n;
        this.designation = m;
        this.prixHT = p;
        this.qte = q;
    }
    // copy constracter
    public Article(Article a){
        this(a.number, a.designation, a.prixHT, a.qte);
    }


    // getters
    public int getNumber(){
        return this.number;
    }
    public String getDesignation(){
        return this.designation;
    }
    public double getPrixHT(){
        return this.prixHT;
    }
    public int getQte(){
        return this.qte;
    }
    // prixTTC
    public double prixTTC(){
        return prixHT + (prixHT*0.1);
    }
}
