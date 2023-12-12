public class PolyMorph {
    public static void main(String[] args){
        Article[] chariot = {
                new Article("Pomme", 1, 10, 100 ),
                new ArticleLuxe("iPhone", 2, 200, 100),
                new Vetement("Pull", 3, 30, 100, "5", "Vert")
        } ;
        double montant = 0;
        for (Article p:chariot) {
            montant += p.PrixTTC();
        }
        System.out.println(montant);
    }
}
