import java.util.Scanner;

public class Pile {

    static final int MAX = 8;
    char t[];
    int top;

    public Pile() {
        t = new char[MAX];
        top = -1;
    }

    public void empiler(char c) {
        if (!estPleine())
            t[++top] = c;
        else
            System.out.println("Pile pleine");
    }

    public char sommet() {
        if (!estVide())
            return t[top];
        else {
            System.out.println("Pile vide, aucun sommet.");
            return '\0'; // Valeur par défaut si la pile est vide
        }
    }

    public void depiler() {
        if (!estVide())
            top--;
        else
            System.out.println("Impossible de dépiler, la pile est vide.");
    }

    public boolean estVide() {
        return (top < 0);
    }

    public boolean estPleine() {
        return (top == MAX - 1);
    }

    public static void main(String[] args) {
        Pile p = new Pile();

        Scanner input = new Scanner(System.in);
        char c;

        System.out.print("Entrez un caractère ('#' pour terminer) : ");
        c = input.next().charAt(0);

        while (c != '#') {
            p.empiler(c);
            System.out.print("Entrez un caractère ('#' pour terminer) : ");
            c = input.next().charAt(0);
        }

        System.out.println("Éléments de la pile : ");
        while (!p.estVide()) {
            c = p.sommet();
            System.out.println(c);
            p.depiler();
        }
    }
}