public class Article implements MonApi {
    // class article qui implemente l'interface mon api
    private int numero;
    private String designation;
    private double prixHT;
    private int qte;

    public Article(int numero, String designation, double prixHT, int qte) {
        this.numero = numero;
        this.designation = designation;
        this.prixHT = prixHT;
        this.qte = qte;
    }

    public void print() {
        System.out.println(convTexte());
    }

    public String convTexte() {
        return "{" + numero + "," + designation + "," + prixHT + "," + qte + "}";
    }

    public int compare(Object o) {
        Article w = (Article) o;
        if (numero > w.numero)
            return 1;
        else if (numero < w.numero)
            return -1;
        else
            return 0;
    }

    // Autres méthodes de la classe Article
}
