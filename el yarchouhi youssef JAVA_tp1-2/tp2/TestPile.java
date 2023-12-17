import java.util.Scanner;


public class TestPile {
    
    public static void main(String[] arg)throws ExceptionPileUnderflow, ExceptionPileOverflow{
       
        // create a scanner
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("EXERCISE 1: \n");
        char input;
        Pile stack = new Pile();

        System.out.println("enter char followed by '#' to reverse: ");
        // get the first character
        input = scanner1.next().charAt(0);

        // while loop to stock the chars in the stack intel you get '#'
        while (input != '#') {
            stack.empiler(input);
            input = scanner1.next().charAt(0);
        }
        try{
            while (!stack.estVide()) {
                        input = stack.sommet();
                        System.out.print(input);
                        stack.depiler();
                    }
        } catch (ExceptionPileUnderflow e){
            System.out.println("An excetion occorred : " + e.getMessage());
        }
        // closing scanner
        scanner1.close();
 
    }
}



