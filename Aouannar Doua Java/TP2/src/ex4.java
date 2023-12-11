public class ex4 {
    
    // Suponiendo la existencia de la clase pilesimple para la implementación de la pila

    public static boolean parenthese(String expression) {
        pilesimple p = new pilesimple();

        for (char c : expression.toCharArray()) {
            switch (c) {
                case '{':
                case '[':
                case '(':
                    p.empiler(c);
                    break;
                case ')':
                    if (p.estVide() || p.sommet() != '(') {
                        return false;
                    }
                    p.depiler();
                    break;
                case '}':
                    if (p.estVide() || p.sommet() != '{') {
                        return false;
                    }
                    p.depiler();
                    break;
                case ']':
                    if (p.estVide() || p.sommet() != '[') {
                        return false;
                    }
                    p.depiler();
                    break;
                default:
                    break;
            }
        }
        
        return p.estVide();
    }

    public static void main(String[] args) {
        String expression1 = "{[(a+51)-(c)]}";
        String expression2 = "{(a+b)]";
        
        System.out.println("Expression 1 est correcte : " + parenthese(expression1));
        System.out.println("Expression 2 est correcte : " + parenthese(expression2));
    }
}
