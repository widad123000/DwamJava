package tp8;

public class Article implements MonApi{

    protected String designation;
    protected int numero;
    protected double prixHT;
    protected int qte;

    @Override
    public void print() {
        System.out.println(convTexte());
    }

    @Override
    public String convTexte() {
        return "{" + numero + "," + designation + "," + prixHT + "," + qte + "}";
    }

    @Override
    public int compare(Object o) {
        Article a = (Article) o;

        if (numero > a.numero){
            return 1;
        }
        else if (numero < a.numero){
            return -1;
        }
        else return 0;
    }
    public Article()
    {
        this.designation="spécimen";
        this.numero=0;
        this.prixHT=0;
        this.qte=0;
    }

    //constructeur par copié
    public Article(tp4_bis.Article a)
    {
        this.designation = a.getDesignation();
        this.numero=a.getNumero();
        this.prixHT= a.getPrixHT();
        this.qte=a.getQte();
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
    public double prixTTC()
    {
        return prixHT*1.1;
    }

}
