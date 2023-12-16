package tp5;

public class Test {

    public static void main(String[] args) {

        Coureur c = new Coureur();
        c.courirOuMarcher();

        System.out.println();

        //Si Loisir c = new Coureur(); la méthode .courirMoins() ne va pas marcher
        c.courirMoins();

        System.out.println("\nTableau des loisirs");
        Loisir mesLoisirs[] = { new Marcheur(), new Coureur() };

        for (Loisir loisir : mesLoisirs) {
            loisir.courirOuMarcher();
        }

    }
}
