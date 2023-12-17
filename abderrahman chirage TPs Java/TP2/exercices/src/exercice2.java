import java.util.Scanner;

public class exercice2 {

    public static void main(String[] args) {
        Pile p = new Pile();

        Scanner input = new Scanner(System.in);
        System.out.println("Entrez une série de parenthèses (# pour terminer) : ");
        char c = input.next().charAt(0);

        while (c != '#') {
            if (c == '(') {
                p.empiler(c);
            } else if (c == ')') {
                if (!p.estVide()) {
                    p.depiler();
                } else {
                    System.out.println("Erreur : plus de parenthèses ouvrantes que de parenthèses fermantes.");
                    return;
                }
            }
            
            c = input.next().charAt(0);
        }

        if (p.estVide()) {
            System.out.println("L'expression est bien parenthésée.");
        } else {
            System.out.println("Erreur : plus de parenthèses fermantes que de parenthèses ouvrantes.");
        }
    }
}
