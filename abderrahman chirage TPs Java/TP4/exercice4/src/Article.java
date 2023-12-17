public class Article {
    protected String designation;
    protected int numero;
    protected double prixHT;
    protected int qte;
    public Article()
    {
        this.designation="spécimen";
        this.numero=0;
        this.prixHT=1.1;
        this.qte=222;
    }
    public Article(Article a)
    {
        this.designation=a.designation;
        this.numero=a.numero;
        this.prixHT= a.prixHT;
        this.qte=a.qte;
    }
    public Article(String designation,int numero,double prixHT,int qte)
    {
        this.designation=designation;
        this.numero=numero;
        this.prixHT=prixHT;
        this.qte=qte;
    }
    public void ajouter(int q)
    {
        this.qte=this.qte+q;
    }
    public void retirer(int q)
    {
        this.qte=this.qte-q;
    }
    public String getDesignation()
    {
        return designation;
    }
    public int getNumero()
    {
        return numero;
    }
    public double getPrixHT() {
        return prixHT;
    }
    public int getQte()
    {
        return qte;
    }
    public double PrixTTC()
    {
        return prixHT*1.1;
    }


}