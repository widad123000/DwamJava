package tp7.ma;

import java.util.Scanner;

public class pile1 {
	static final int MAX = 8;
	char []t = new char[MAX]; 
	int top;
	public void empiler(char c) {
		// Empile le caractère donné en paramètre 
		t[++top] = c;}
	//retourner le sommet
			 public char sommet(){
				  return  t[top];}

		
			 public void depiler(){
				 top--;}
			 public String toString() {
				 String a="";
				 for (int i=0;i<=top;i++) {
					 a=a+t[i];
				 } return a;
			 }
			public boolean estVide() {
				return (top < 0);
			}
			
			 public boolean estPleine() {
				 return (top ==t.length);
			 }
			
	public static void main(String[] args) {


		        Scanner scanner = new Scanner(System.in);

		        // Création d'une instance de MaPile avec une taille maximale de 100
		        pile2 maPile = new pile2(100);

		        System.out.println("Entrez des caractères (terminez par '#'):");

		        // Lecture des caractères jusqu'à ce que '#' soit entré
		        char caractereLu;
		        do {
		            caractereLu = scanner.next().charAt(0);

		            if (caractereLu != '#') {
		                maPile.empiler(caractereLu);
		            }
		        } while (caractereLu != '#');

		        // Impression des caractères en ordre inverse
		        System.out.println("Caractères en ordre inverse :");
		        while (!maPile.estVide()) {
		            System.out.print(maPile.toString());
		        }

		        scanner.close();
		   
		

	}}

