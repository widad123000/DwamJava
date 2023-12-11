import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		pilesimple p = new pilesimple();
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez une chaîne de caractères (terminez par '#'): ");
		char c = sc.next().charAt(0);
		
		boolean parenthese = true;
		while(c!='#') {
			if(c=='(') {
				p.empiler(c);
			}
			else if(c==')') {
				if(!p.estVide()) {
				p.depiler();
			}
			else {
				parenthese=false;
				break;
			}
			}
			 c = sc.next().charAt(0);
		}
		if(!p.estVide() || !parenthese) {
			System.out.println("il y a plus de parenthèses ouvrantes que de parenthèses fermantes");
		}
		else {
			System.out.println("l'expression est bien parenthésée");
		}
		sc.close();

	}

}
