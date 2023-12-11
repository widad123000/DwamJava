
import java.util.*;

public class exercice1pile {

	public static void main(String[] args) {
		pilesimple P = new pilesimple();
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez une chaîne de caractères (terminez par '#'): ");
		char c = sc.next().charAt(0);
		
		while(c!='#') {
			P.empiler(c);
		  c = sc.next().charAt(0);	
		}
		while(!P.estVide()) {
			c=P.sommet();
			System.out.println(c);
			P.depiler();
			
		}
		sc.close();
		
	}

}
