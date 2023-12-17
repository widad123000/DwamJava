import java.util.EmptyStackException;

public class MaPile {
    private StringBuilder pile;

    public MaPile() {
        pile = new StringBuilder();
    }

    // Méthode pour empiler un caractère sur la pile
    public void empiler(char c) {
        pile.append(c);
    }

    // Méthode pour dépiler un caractère de la pile
    public char depiler() {
        if (estVide()) {
            throw new EmptyStackException();
        }

        char sommet = pile.charAt(pile.length() - 1);
        pile.deleteCharAt(pile.length() - 1);
        return sommet;
    }

    // Méthode pour vérifier si la pile est vide
    public boolean estVide() {
        return pile.length() == 0;
    }

    // Méthode pour obtenir la taille de la pile
    public int taille() {
        return pile.length();
    }

    // Méthode pour afficher le contenu de la pile
    public void afficherContenu() {
        System.out.println("Contenu de la pile : " + pile.toString());
    }

    public static void main(String[] args) {
        MaPile maPile = new MaPile();

        // Empiler des caractères
        maPile.empiler('b');
        maPile.afficherContenu();

        maPile.empiler('r');
        maPile.afficherContenu();

        maPile.empiler('d');
        maPile.afficherContenu();

        // Dépiler des caractères
        char sommet = maPile.depiler();
        System.out.println("Sommet dépilé : " + sommet);
        maPile.afficherContenu();

        // Vérifier si la pile est vide
        System.out.println("La pile est vide : " + maPile.estVide());

        // Obtenir la taille de la pile
        System.out.println("Taille de la pile : " + maPile.taille());
    }
}

