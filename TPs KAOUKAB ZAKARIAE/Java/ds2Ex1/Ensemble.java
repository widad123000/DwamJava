import java.util.Scanner;

public class Ensemble {
    private static final int MAX_SIZE = 10;
    private String[] tab;
    private int size;

    // Constructeur sans paramètre
    public Ensemble() {
        tab = new String[MAX_SIZE];
        tab[0] = "";
        size = 1;
    }

    // Constructeur avec un paramètre pour le nombre d'éléments
    public Ensemble(int initialSize) {
        if (initialSize > MAX_SIZE) {
            System.out.println("Taille initiale trop grande. Initialisation avec la taille maximale.");
            initialSize = MAX_SIZE;
        }
        tab = new String[MAX_SIZE];
        for (int i = 0; i < initialSize; i++) {
            tab[i] = "";
        }
        size = initialSize;
    }

  


    public void remplir() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < MAX_SIZE; i++) {
            System.out.print("Entrez la chaîne à l'index " + i + " : ");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            tab[i] = input;
            size++;
        }
    }

    // Fonction d'affichage
    public void afficher() {
        System.out.print("Ensemble : { ");
        for (int i = 0; i < size; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println("}");
    }

    // Fonction est_membre
    public boolean estMembre(String x) {
        for (int i = 0; i < size; i++) {
            if (tab[i].equals(x)) {
                return true;
            }
        }
        return false;
    }

    // Fonction ajouter
    public void ajouter(String x) {
        if (!estMembre(x) && size < MAX_SIZE) {
            tab[size] = x;
            size++;
        }
    }

    // Fonction supprimer
    public void supprimer(String x) {
        for (int i = 0; i < size; i++) {
            if (tab[i].equals(x)) {
                for (int j = i; j < size - 1; j++) {
                    tab[j] = tab[j + 1];
                }
                size--;
                break;
            }
        }
    }

    // Fonction copier
    public void copier(Ensemble other) {
        for (int i = 0; i < other.size; i++) {
            tab[i] = other.tab[i];
        }
        size = other.size;
    }

    // Fonction est_egal
    public boolean estEgal(Ensemble other) {
        if (this.size != other.size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!this.tab[i].equals(other.tab[i])) {
                return false;
            }
        }
        return true;
    }

    // Fonction vider
    public void vider() {
        size = 0;
    }

    // Fonction est_egal indépendante de la classe Ensemble
    public static boolean estEgal(Ensemble e1, Ensemble e2) {
        if (e1.size != e2.size) {
            return false;
        }
        for (int i = 0; i < e1.size; i++) {
            if (!e1.tab[i].equals(e2.tab[i])) {
                return false;
            }
        }
        return true;
    }

    // Fonction vider indépendante de la classe Ensemble
    public static void vider(Ensemble e) {
        e.size = 0;
    }

    public static void main(String[] args) {
        Ensemble ensemble1 = new Ensemble();
        ensemble1.remplir();
        ensemble1.afficher();

        Ensemble ensemble2 = new Ensemble(5);
        ensemble2.remplir();
        ensemble2.afficher();


    }
}
