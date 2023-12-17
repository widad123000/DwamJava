package java;
import java.util.Scanner;
import java.util.Stack;

public class ParenthesesChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        System.out.println("Entrez une série de parenthèses (terminer par #) : ");
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            
            if (c == '#') {
                break;
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println("L'expression est bien parenthésée.");
        } else {
            System.out.println("L'expression n'est pas bien parenthésée.");
            System.out.println("Il y a plus de parenthèses ouvrantes que de parenthèses fermantes, ou vice versa.");
        }

        scanner.close();
    }
}
