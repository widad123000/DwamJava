import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args)throws ExceptionPileUnderflow, ExceptionPileOverflow{

        System.out.println("EXERCISE 4: \n");
        // create a scanner 
        Scanner scanner4 = new Scanner(System.in);
        // get user input
        System.out.println("enter your text : ");
        String userinput = scanner4.nextLine();

        // creat a stack
        Pile stack4 = new Pile();
        // loop over the text
        for(int i=0; i<userinput.length(); i++){

            if(userinput.charAt(i) == '[' || userinput.charAt(i) == '{' || userinput.charAt(i) == '<' || userinput.charAt(i) == '('){
                
                stack4.empiler(userinput.charAt(i));
            }else if (userinput.charAt(i) == ']' || userinput.charAt(i) == '}' || userinput.charAt(i) == '>' || userinput.charAt(i) == ')') {
               
                if(!stack4.estVide() && bracketsMatch(stack4.sommet(), userinput.charAt(i))){
                    
                    stack4.depiler();

                } else{
                    break;
                }
                
            }else{
                continue;
            }
            
        }
        System.out.println(stack4.estVide());
        // closing scanner 
        scanner4.close();  
    }

    public static boolean bracketsMatch(char opening, char closing){
        return  (opening == '(' && closing == ')') ||
                (opening == '{' && closing == '}') ||
                (opening == '<' && closing == '>') ||
                (opening == '[' && closing == ']');
        }
}
