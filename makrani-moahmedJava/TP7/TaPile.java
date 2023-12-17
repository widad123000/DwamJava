/**
 * TaPile
 */
public class TaPile {

    char t[];
    int top;
    static int max = 8;

    // Programmation des opérations (méthodes) de la pile
    public TaPile() {
        this.t = new char[max];
        this.top = -1;
    }

    public boolean estPleine() {
        return (this.top == max - 1);
    }

    public boolean estVide() {
        return (this.top == -1);
    }

    public void empiler(char c) {
        if (!estPleine()) {
            t[top] = c;
            top++;
        } else {
            System.out.println("Pile pleine");
        }
    }

    public char sommet() {
        // Retourne le caractère au sommet de la pile
        if (!estVide()) {
            return t[top];
        } else {
            throw new IllegalStateException("La pile est vide");
        }
    }

    public void depiler() {
        // Dépile la pile (retire le sommet)
        if (!estVide()) {
            top--;
        } else {
            System.out.println("La pile est vide");
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= top; i++) {
            result.append(t[i]);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        TaPile taPile = new TaPile();

        // Empiler des caractères
        taPile.empiler('b');
        System.out.println("Contenu de la pile : " + taPile);

        taPile.empiler('r');
        System.out.println("Contenu de la pile : " + taPile);

        taPile.empiler('d');
        System.out.println("Contenu de la pile : " + taPile);

        // Dépiler des caractères
        char sommet = taPile.sommet();
        System.out.println("Sommet de la pile : " + sommet);
        taPile.depiler();
        System.out.println("Contenu de la pile après dépilement : " + taPile);

        // Vérifier si la pile est vide
        System.out.println("La pile est vide : " + taPile.estVide());

        // Vérifier si la pile est pleine
        System.out.println("La pile est pleine : " + taPile.estPleine());
    }
}
