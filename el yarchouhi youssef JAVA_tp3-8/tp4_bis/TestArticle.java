package tp4_bis;


public class TestArticle {
    public static void main(String[] args){

        // Article a = new Article();
        // Article a2 = new Article(1, "Pomme", 10, 100);
        // Article a3 = new Article(a);

        // System.out.println(a2.getNumber());
        // System.out.println(a2.getDesignation());
        // System.out.println(a2.prixTTC());
        // System.out.println(a2.getQte());

        // ESSAI SIMPLE HERITAGE ET POLYMORPHISME

        // Article[] chariot = {
        //     new Article(1, "Pomme", 10, 100),
        //     new ArticleLuxe(2, "iPhone", 200, 100),
        //     new Vetement(3, "Pull", 30, 100, "XXL", "RED")
        // };

        // double montant = 0.0;

        // for (Article article : chariot) {
        //     montant += article.prixTTC();
        // }

        // System.out.println("Montant : "+montant);

        // ex3
        Article ar1 = new Article(1, "Pomme", 10, 100);
        Article ar2 = new Article(2, "stuff", 25, 21);
        Article ar3 = new Article(3, "stuff2", 2, 25);

        System.out.println(ar1.prixTTC());
        System.out.println(ar2.prixTTC());
        System.out.println(ar3.prixTTC());
        
        System.out.println("now with priceCalculator: ");
        PriceCalculator priceCalculator = new PriceCalculator();
        priceCalculator.displayPriceWithTaxes(ar1);
        priceCalculator.displayPriceWithTaxes(ar2);
        priceCalculator.displayPriceWithTaxes(ar3);

    }
}
