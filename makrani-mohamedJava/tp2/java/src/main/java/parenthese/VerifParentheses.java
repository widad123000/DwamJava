package parenthese;
import java.util.Stack;
public class VerifParentheses {
    
    public static boolean estParenthesee(String expression) {
        Stack<Character> pile = new Stack<>();
        
        for (char caractere : expression.toCharArray()) {
            if (caractere == '(' || caractere == '[' || caractere == '{' || caractere == '<') {
                pile.push(caractere);
            } else if (caractere == ')' || caractere == ']' || caractere == '}' || caractere == '>') {
                if (pile.isEmpty()) {
                    return false;
                }
                char sommet = pile.pop();
                if (!correspond(caractere, sommet)) {
                    return false;
                }
            }
            //
        }
        
        return pile.isEmpty(); 
    }
    
    private static boolean correspond(char fermante, char ouvrante) {
        return (fermante == ')' && ouvrante == '(') ||
               (fermante == ']' && ouvrante == '[') ||
               (fermante == '}' && ouvrante == '{') ||
               (fermante == '>' && ouvrante == '<');
    }

}
