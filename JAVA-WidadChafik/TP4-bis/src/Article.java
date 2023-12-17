public class Article {
    protected String designation;
    protected  int numero;
    protected  double prixHT;
    protected int qte;
    Article(){
        designation="Spécimen";
        numero=0;
        prixHT=1;
        qte=222;

    }
    public Article(Article a){
        this.designation=a.designation;
        this.numero=a.numero;
        this.prixHT=a.prixHT;
        this.qte=a.qte;
    }
    public Article(int numero,String designation,double prixHT,int qte) {
        this.designation=designation;
        this.numero=numero;
        this.prixHT=prixHT;
        this.qte=qte;
    }
    public void ajouterQte(int qte){
        this.qte+=qte;
    }
    public String getDesignation(){
        return designation;
    }
    public int getQte(){
        return qte;
    }
    public int getNumero(){
        return numero;
    }
    public double getPrixHT(){
        return prixHT;
    }
    public double prixTTC(){
       return prixHT*1.1;
    }
    public int retirer(int qte)
    {
        return this.qte-qte;
    }
}

