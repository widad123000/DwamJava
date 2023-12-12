import java.util.Arrays;

public class DS1 {
    // Exercice 1: Ensemble class
    class Ensemble {
        private static final int MAX_SIZE = 50;
        private String[] tab;
        private int size;

        public Ensemble() {
            this.tab = new String[MAX_SIZE];
            this.size = 0;
        }

        public Ensemble(int n) {
            this.tab = new String[n];
            this.size = 0;
        }

        public Ensemble(Ensemble other) {
            this.tab = Arrays.copyOf(other.tab, other.size);
            this.size = other.size;
        }

        public void remplir() {
            // Implement the remplir method as needed
        }

        public void afficher() {
            // Implement the afficher method as needed
        }

        public boolean est_membre(String x) {
            // Implement the est_membre method as needed
            return false;
        }

        public void ajouter(String x) {
            // Implement the ajouter method as needed
        }

        public void supprimer(String x) {
            // Implement the supprimer method as needed
        }

        public void copier(Ensemble other) {
            this.tab = Arrays.copyOf(other.tab, other.size);
            this.size = other.size;
        }

        public boolean est_egal(Ensemble other) {
            // Implement the est_egal method as needed
            return false;
        }

        public void vider() {
            // Implement the vider method as needed
        }

        // Functions independent of the Ensemble class
        public static void vider(Ensemble ens) {
            ens.vider();
        }

        public static boolean est_egal(Ensemble ens1, Ensemble ens2) {
            return ens1.est_egal(ens2);
        }

        public static void main(String[] args) {
            // Test the various methods here
        }
    }

    // Exercice 2: Point class
    class Point {
        private float x, y;
        private static int count = 0;  // Compteur d'objets créés

        public Point(float x, float y) {
            this.x = x;
            this.y = y;
            count++;
        }

        public void deplace(float dx, float dy) {
            x += dx;
            y += dy;
        }

        public void affiche() {
            System.out.println("Coordonnées du point : (" + x + ", " + y + ")");
            System.out.println("Nombre d'objets créés de type point : " + count);
        }

        public static void main(String[] args) {
            Point p1 = new Point(1.0f, 2.0f);
            Point p2 = new Point(3.0f, 4.0f);

            p1.affiche();
            p2.affiche();
        }
    }

    // Exercice 3: Compte, Noeud, ListeChainee classes
    public class Compte {
        private int numero;
        private double solde;
        private String etat;

        public Compte(int numero, double solde, String etat) {
            this.numero = numero;
            this.solde = solde;
            this.etat = etat;
        }

        // Getter and Setter methods
    }

    public class Noeud {
        public Compte compte;
        public Noeud suivant;

        public Noeud(Compte compte) {
            this.compte = compte;
            this.suivant = null;
        }
    }

    public class ListeChainee {
        private Noeud tete;

        public ListeChainee() {
            this.tete = null;
        }

        public void insertLast(Compte compte) {
            Noeud nouveauNoeud = new Noeud(compte);
            if (tete == null) {
                tete = nouveauNoeud;
            } else {
                Noeud courant = tete;
                while (courant.suivant != null) {
                    courant = courant.suivant;
                }
                courant.suivant = nouveauNoeud;
            }
        }

        public void afficherListe() {
            Noeud courant = tete;
            while (courant != null) {
                System.out.println("Compte Numero: " + courant.compte.numero + ", Solde: " + courant.compte.solde +
                        ", Etat: " + courant.compte.etat);
                courant = courant.suivant;
            }
        }

        // Add other methods as needed...
    }

    public static void main(String[] args) {
        ListeChainee liste = new ListeChainee();

        Compte compte1 = new Compte(1, 1000.0, "Actif");
        Compte compte2 = new Compte(2, 2000.0, "Inactif");

        liste.insertLast(compte1);
        liste.insertLast(compte2);

        liste.afficherListe();
        // Test other methods as needed
    }
}
