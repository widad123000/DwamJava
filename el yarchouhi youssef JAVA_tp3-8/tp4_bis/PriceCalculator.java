package tp4_bis;

public class PriceCalculator {
    

    public void displayPriceWithTaxes(Article article){
        double priceWithTaxes = article.prixTTC();
        System.out.println("the price with taxes is " + priceWithTaxes);
    }
}
