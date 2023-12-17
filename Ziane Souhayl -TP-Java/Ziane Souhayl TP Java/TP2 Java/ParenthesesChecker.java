import java.util.Scanner;
import java.util.Stack;

public class ParenthesesChecker {
    public static void main(String[] args) {
        Stack<Character> pile = new Stack<>();
        char caractere;

        Scanner clavier = new Scanner(System.in);
        System.out.println("Saisissez un texte contenant des parenthèses (terminez par '#'):");

        caractere = clavier.next().charAt(0);
        while (caractere != '#') {
            if (caractere == '(') {
                pile.push(caractere);
            } else if (caractere == ')') {
                                if (!pile.isEmpty()) {
                    pile.pop();
                } else {
                    System.out.println("Erreur :");
                    return; 
                }
            }
            caractere = clavier.next().charAt(0);
        }

        if (pile.isEmpty()) {
            System.out.println("L'expression est bien parenthésée.");
        } else {
            extracted();
        }
    }

    private static void extracted() {
        System.out.println("Erreur");
    }
}
 {
    
}
