import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){
        System.out.println("EXERCISE 2: \n");

        // create a scanner
        Scanner scanner2 = new Scanner(System.in);
        
        // get the text form the user
        System.out.println("enter a string: ");
        String text = scanner2.nextLine();

        // create a stack
        Pile stack2 = new Pile();

        // loop over the text 
        for(int i=0; i<text.length(); i++){
            if(text.charAt(i) == '('){
                stack2.empiler(text.charAt(i));
            }else if(text.charAt(i) == ')'){
                stack2.depiler();
            }else if(text.charAt(i) == '#'){
                break;
            }else{
                continue;
            }
        }

        System.out.println(stack2.estVide());
        // closing scanner 
        scanner2.close();
    }
}
