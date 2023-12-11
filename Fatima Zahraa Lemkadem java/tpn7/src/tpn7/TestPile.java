package tpn7;

import java.util.Scanner;

public class TestPile {
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in );
		/*MaPile p = new MaPile();
		System.out.println("entrez des caracteres. (# pour arreter)");
		char input ;
		do {
			input = scanner.next().charAt(0);
			if(input != '#') {
				p.empiler(input);
			}
		}while(input != '#');
		System.out.println("Carctéres en ordre inverse :");
		while(!p.vide()) {
			System.out.println(p.sommet());
			p.depiler();
		}*/
		TaPile tp = new TaPile();
		System.out.println("entrez des caracteres. (# pour arreter)");
		char input; 
		do {
			input = scanner.next().charAt(0);
			if(input != '#') {
				tp.empiler(input);
			}
		}while(input != '#');
		
		System.out.println("caracteres en ordre inverse : ");
		while(!tp.vide()) {
			System.out.print(tp.sommet());
			tp.depiler();
		}
		
		
		scanner.close();
		
	}
}
