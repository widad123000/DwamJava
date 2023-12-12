package parenthese;

public class Main {

    public static void main(String[] args) {
        String expressionCorrecte = "{[(a+51)-(c)]}";
        String expressionIncorrecte = "{(a+b)]}";

        System.out.println("Expression correcte : " + VerifParentheses.estParenthesee(expressionCorrecte));
        System.out.println("Expression incorrecte : " + VerifParentheses.estParenthesee(expressionIncorrecte));
    }
}



