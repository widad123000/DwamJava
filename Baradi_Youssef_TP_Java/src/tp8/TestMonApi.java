package tp8;

public class TestMonApi {

    public static void main(String[] args) {

        Article a1 = new Article("Livre", 1, 23.0, 7);
        Article a2 = new Article("Stylo", 2, 4.5, 67);

        System.out.println("Affichage du texte formaté");
        System.out.println("Article 1 : " + a1.convTexte());
        System.out.println("Article 2 : " + a2.convTexte());

        System.out.println("\nAffichage avec la méthode print()");
        System.out.println("Article 1 :");
        a1.print();

        System.out.println("\nComparaison d'articles");
        System.out.println("Comparaison d'articles : " + a1.compare(a2));
    }
}
