package tp7;

import java.util.Scanner;

public class TestPile {
    static public void main(String[] args){

        // create a var to store the values and a stack
        char input;
        MaPile stack = new MaPile();
        // creating a scanner
        Scanner scanner = new Scanner(System.in);
        // prompt the user to enter the chars
        System.out.println("enter the characters followed by '#' at the end: ");
        // get the first char
        input = scanner.next().charAt(0);

        // while loop to stock the chars in the stack intel you get '#'
        while (input != '#') {
            // push
            stack.empiler(input);
            // scan
            input = scanner.next().charAt(0);
        }
        // close scanner
        scanner.close();
        
        // dispaly in reverse

        while (!stack.vide()) {
            // peek
            input = stack.sommet();
            // print
            System.out.print(input);
            // pop
            stack.depiler();
        }
    
    }
}
