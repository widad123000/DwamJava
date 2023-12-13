public class Main {
    public static void main(String[] args) {

        Article[] chariot = {
                new Article(1, "Pomme", 10, 100 ),
                new ArticleLuxe(2, "iPhone", 200, 100),
                new Vetement(3, "Pull", 30, 100, 5, "Vert"),
        } ;


        TTC c=new TTC();
        double montant = 0;
        for (Article p:chariot) {
            montant += c.PrixTTC(p);

        }
        System.out.println(montant);
    }

}