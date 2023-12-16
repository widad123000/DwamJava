package tp2;

import java.util.Scanner;

public class TestPile {
    

    
    public static void main(String[] args) throws ExceptionPileOverflow, ExceptionPileUnderflow {

        //exercice4();

        //exercice3();

        //exercice2();

        //exercice1();

        //test();
        //test2();
    }

    public static void exercice4() throws ExceptionPileUnderflow, ExceptionPileOverflow{

        Pile pile = new Pile();

        Scanner scan = new Scanner(System.in);

        System.out.println("Entrez une expression: ");
        String expression = scan.nextLine();

        // la variable qui vérifie si une pile est bien est bien
        //parenthésée ou non
        boolean estEquilibre = true;

        for (int i = 0; i<expression.length(); i++){

            if (expression.charAt(i) == '(' || expression.charAt(i) == '<' ||expression.charAt(i) == '[' ||expression.charAt(i) == '{'){

                pile.empiler(expression.charAt(i));
            }
            else if (expression.charAt(i) == ')' || expression.charAt(i) == '>' ||expression.charAt(i) == ']' ||expression.charAt(i) == '}'){

                if (!(pile.estVide()) && typeSymbole(pile.sommet(),expression.charAt(i)) ){

                    pile.depiler();
                }
                else{
                    estEquilibre = false;
                    break;
                }
            }
        }

        System.out.println("L'expression est bien parenthésée? " +estEquilibre);

    }
    public static boolean typeSymbole(char open, char close){

        //méthode utilisée dans l'exercice 4

        return ((open=='(' && close==')') ||
                (open=='<' && close=='>') ||
                (open=='[' && close==']') ||
                (open=='{' && close=='}')
                );
    }
    public static void exercice3() throws ExceptionPileOverflow,ExceptionPileUnderflow{

        System.out.println("Exercice 4:");

        Pile p1 = new Pile();

        Scanner scan = new Scanner(System.in);

        //test de ExceptionPileUnderflow
        //p1.depiler();

        p1.empiler('C');
        p1.empiler('A');
        p1.empiler('W');
        p1.empiler('T');
        p1.empiler('Z');
        p1.empiler('R');
        p1.empiler('F');
        p1.empiler('P');

        System.out.println("La taille de pile est: " + p1.size());

        //test de ExceptionPileUnderflow
        System.out.println("Voulez vous déplier la pile ? (o = oui | n = non )");
        char choix = scan.next().charAt(0);

        while (choix == 'o'){

            p1.depiler();

            System.out.println("Voulez vous déplier la pile ? (o = oui | n = non )");
            choix = scan.next().charAt(0);
        }

        //test de ExceptionPileOverflow
        System.out.println("Voulez vous empiler la pile ? (o = oui | n = non )");
        choix = scan.next().charAt(0);

        while (choix == 'o'){

            System.out.println("Entrez un caractère: ");
            char caractere = scan.next().charAt(0);

            p1.empiler(caractere);

            System.out.println("Voulez vous empiler la pile ? (o = oui | n = non )");
            choix = scan.next().charAt(0);
        }

    }

    public static void exercice2() throws ExceptionPileUnderflow, ExceptionPileOverflow{

        Pile p1 = new Pile();
        Pile p2 = new Pile();

        String txt1 = "( ( a + b ) * c ) #";

        String txt2 = "( ( a + b ) * c )) #";

        System.out.println("le test de text 1:");
        estEquilibre(txt1,p1);

        System.out.println("\nle test de text 2:");
        estEquilibre(txt2,p2);
    }

    public static void estEquilibre(String txt, Pile pile) throws ExceptionPileOverflow, ExceptionPileUnderflow {

        //méthode utilisée dans l'exercice 2

        String [] arrTxt = txt.split("");

        for (String s : arrTxt) {
            if (s.equals("(")) {

                pile.empiler('(');
            } else if (s.equals(")")) {

                if (pile.estVide()) {
                    System.out.println("La pile n'est pas équilibre");
                    break;
                }
                pile.depiler();
            } else if (s.equals("#")) {
                System.out.println("La pile est équilibre");
                System.out.println("La pile est vide");
                break;
            }
        }
    }

    public static void exercice1() throws ExceptionPileUnderflow, ExceptionPileOverflow {

        Pile p1 = new Pile();

        Scanner scan = new Scanner(System.in);

        char c ;
        System.out.println("Entrez un caractère : ");
        c = scan.next().charAt(0);

        // boucle while
        while (c != '#'){

            p1.empiler(c);

            c = scan.next().charAt(0);
        }

        while (!p1.estVide()) {
            char temp;

            temp = p1.sommet();

            System.out.println(temp);

            p1.depiler();
        }
    }

    public static void test() throws ExceptionPileOverflow, ExceptionPileUnderflow {

        Pile p1 = new Pile();

        System.out.println("La pile est vide ? " + p1.estVide());

        p1.empiler('A');
        p1.empiler('B');
        p1.empiler('C');
        p1.empiler('D');
        p1.empiler('E');

        System.out.println(p1.top);

        System.out.println(p1.sommet());

        System.out.println("La pile est pleine ? " + p1.estPleine());

        System.out.println("La affichage de Pile :");
        p1.affichePile();
    }

    public static void test2(){

        Pile p1 = new Pile();

        Scanner scan = new Scanner(System.in);

        char c;
        System.out.println("Entrez un caractere :");
        c = scan.next().charAt(0);

        while (c != '#'){
            try
            {
                p1.empiler(c);
            }
            catch (ExceptionPileOverflow epo)
            {
                System.out.println("la pile est pleine");
                System.out.println(epo.getStackTrace());
            }

            c = scan.next().charAt(0);
        }
    }
    
}