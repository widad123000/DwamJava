import java.util.Scanner;

public class ParenthesesVerifier {

    public static boolean estParenthesee(String expression) {
        Pile pile = new Pile();

        for (char caractere : expression.toCharArray()) {
            if (caractere == '(' || caractere == '[' || caractere == '{') {
                pile.empiler(caractere);
            } else if (caractere == ')' || caractere == ']' || caractere == '}') {
                if (pile.estVide()) {
                    return false;
                }

                char parentheseOuvrante = pile.sommet();
                pile.depiler();

                if (!parenthesesCorrespondent(parentheseOuvrante, caractere)) {
                    return false;
                }
            }

        }

        return pile.estVide();
    }

    private static boolean parenthesesCorrespondent(char ouvrante, char fermante) {
        return (ouvrante == '(' && fermante == ')') ||  (ouvrante == '[' && fermante == ']') ||  (ouvrante == '{' && fermante == '}');
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez une expression : ");
        String expression = input.nextLine();

        if (estParenthesee(expression)) {
            System.out.println("L'expression est bien parenthésée.");
        } else {
            System.out.println("L'expression n'est pas bien parenthésée.");
        }
    }
}
