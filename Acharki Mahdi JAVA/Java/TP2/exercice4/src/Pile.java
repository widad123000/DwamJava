class ExceptionPileUnderflow extends RuntimeException {
}

class ExceptionPileOverflow extends RuntimeException {
}

public class Pile {

    static final int MAX = 8;
    char t[];
    int top;

    public Pile() {
        t = new char[MAX];
        top = -1;
    }

    public void empiler(char c) throws ExceptionPileOverflow {
        if (!estPleine())
            t[++top] = c;
        else
            throw new ExceptionPileOverflow();
    }

    public char sommet() throws ExceptionPileUnderflow {
        if (!estVide())
            return t[top];
        else
            throw new ExceptionPileUnderflow();
    }

    public void depiler() throws ExceptionPileUnderflow {
        if (!estVide())
            top--;
        else
            throw new ExceptionPileUnderflow();
    }

    public boolean estVide() {
        return (top < 0);
    }

    public boolean estPleine() {
        return (top == MAX - 1);
    }

    public static void main(String[] args) {
        Pile p = new Pile();

        try {

            p.empiler('A');
            p.empiler('B');
            System.out.println("Sommet de la pile : " + p.sommet());

            while (!p.estVide()) {
                System.out.println("Dépiler : " + p.sommet());
                p.depiler();
            }




            for (int i = 0; i < MAX + 1; i++) {
                p.empiler((char) ('A' + i));
            }
        } catch (ExceptionPileUnderflow e) {
            System.out.println("Erreur : Pile vide.");
        } catch (ExceptionPileOverflow e) {
            System.out.println("Erreur : Pile pleine.");
        }
    }
}
