package tp8;

public class Article implements MonApi{
    private int number;
    private String designation; 
    private double prixHT;
    private int qte;

    // interface's methods 
    // Afficher sur l'unite standard de sortie
    public void print(){
        System.out.println(convText());
    }

    // formate un objet vers un text
    public String convText(){
        String s = "{" + number + ", "
                       + designation + ", "
                       + prixHT + ", "
                       + qte + "}";
        return s;
    }

    // compare this avec o. return -1, 0 ou 1
    public int compare(Object o){
        // comapre numbers for example
        Article w = (Article) o;
        if(number > w.number)
            return 1;
        else if (number < w.number)
            return -1;
        else 
            return 0;
    }




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
