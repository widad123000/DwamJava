
public class Article implements MonApi {
    private int  numero;
    private String designation;
    double prixHT;
    int qte;
      Article(int numero, String designation, double prixHT, int qte){
          this.numero=numero;
          this.prixHT=prixHT;
          this.qte=qte;
          this.designation=designation;

      }
    @Override
    public void print() {
        System.out.println(convTexte());
    }

    public String convTexte() {
        String s ="{" + numero + "," + designation + "," + prixHT + "," + qte + "}" ;
        return s;}


    public int compare(Object o) {
        Article w = (Article) o;
        if (numero > w.numero)
            return 1;
        else if (numero < w.numero)
            return -1;
        else
            return 0;
    }
}
