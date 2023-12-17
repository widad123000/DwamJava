package Ex1;
import java.util.Scanner;
class EX1_Main {

	public static void main(String[] args) throws Exception {
		Pile p= new Pile();
		char c;
		Scanner scnr= new Scanner(System.in);
		int s;
		s=Integer.parseInt(scnr.next());
		System.out.println("Enter characters, '#' to stop:");
		c =scnr.next().charAt(0);		
		
		
	
	 while (c != '#') {
         p.empiler(c);
         c = scnr.next().charAt(0);
     }
	while(!p.estVide()) {
		c=p.sommet() ;
		System.out.println(c);
		p.depiler(); 
         
	}
	}

}
