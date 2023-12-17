public class TestLoisir {
    public static void main(String[] args) {
        Loisir c = new Coureur(); 
        c.courirOuMarcher(); 
        Coureur coureur = new Coureur();
        coureur.courirMoins();
        Loisir mesLoisirs[] = {new Marcheur(), new Coureur()};

        for (Loisir loisir : mesLoisirs) {
            loisir.courirOuMarcher();
        }
    }
}
