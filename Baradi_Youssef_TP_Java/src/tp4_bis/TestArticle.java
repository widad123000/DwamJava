package tp4_bis;

public class TestArticle {

    public static void main(String[] args) {

        Article a1 = new Article () ;
        Article a2 = new Article("Pomme",1,11.0,100);
        Article a3 = new Article(a1);

        System.out.println("Article 1: ");
        System.out.println("Numéro: " + a1.getNumero());
        System.out.println("Désignation: " + a1.getDesignation());
        System.out.println("Prix TTC: " + a1.prixTTC());
        System.out.println("Qunatité: " + a1.getQte());

        System.out.println("\nArticle 2: ");
        System.out.println("Numéro: " + a2.getNumero());
        System.out.println("Désignation: " + a2.getDesignation());
        System.out.println("Prix TTC: " + a2.prixTTC());
        System.out.println("Qunatité: " + a2.getQte());

        System.out.println("\nArticle 3: ");
        System.out.println("Numéro: " + a3.getNumero());
        System.out.println("Désignation: " + a3.getDesignation());
        System.out.println("Prix TTC: " + a3.prixTTC());
        System.out.println("Qunatité: " + a3.getQte());

    }
}
