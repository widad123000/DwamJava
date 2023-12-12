import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
       MaPile pile =  new MaPile();
       Scanner sc = new Scanner(System.in);
       char character;
       System.out.println("Saisissez des caractères (terminer par '#') :");
       String input = sc.nextLine();
       for(int i = 0; i < input.length(); i++){
        character = input.charAt(i);
        if(character!='#'){
        pile.empiler(character);
       }else{break;
       } 
    } 
     System.out.println("Reversed string:");
     while (!pile.vide()) {
         System.out.print(pile.sommet());
         pile.depiler();
     }

     sc.close();

}
}