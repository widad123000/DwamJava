import java.util.Scanner;
import java.util.Stack;

public class TestPile {
    public static void main(String[] args) {
        Stack<Character> pile = new Stack<>();
        char c;

        Scanner clavier = new Scanner(System.in);
        System.out.println("Saisissez une chaîne de caractères (terminez par '#'):");

        c = clavier.next().charAt(0);
        while (c != '#') {
            pile.push(c);
            c = clavier.next().charAt(0);
        }
        System.out.println("Chaîne inversée:");
        while (!pile.isEmpty()) {
            c = pile.pop();
            System.out.print(c);
        }
    }
}
