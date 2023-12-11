import java.util.Scanner;

public class MaPile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PileStringBuilder p = new PileStringBuilder();

		
		System.out.println("entrer un chaine charactere termine par #");
		char c ;
		
		do {
			c = sc.next().charAt(0);
			if(c!='#') {
				p.empiler(c);
			}
		}while(c!='#');
		 System.out.println("Affichage des caractères en ordre inverse :");
	        while (!p.estVide()) {
	        	System.out.println(p.sommet());
	         p.depiler();
	        }
	        sc.close();

	}

}
