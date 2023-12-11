package tp2.ma;

import java.util.Scanner;
//ex1
public class Pile {
	static final int MAX = 8;
	char t[]; 
	int top;
	public Pile() {
		// Initialise une pile vide 
		t = new char[MAX];
		top = -1;
		}
	public void empiler(char c) {
		// Empile le caractère donné en paramètre 
		if (!estPleine())
		t[++top] = c;
		else
			System.out.println("Pile pleine");}
	//retourner le sommet
			 public char sommet() {
				 return t[top];
			 }
		
			 public void depiler() {
				if (!estVide()) {
				top--;}
				else {System.out.println("pile vide");
					}
			 }
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
		Pile p=new Pile();
		System.out.print("Veuillez entrer c : ");
		char monchar = 0;
		 Scanner clavier = new Scanner(System.in);
			monchar = clavier.next().charAt(0);
		
		while ( monchar != '#') {
			p.empiler(monchar);
			System.out.print("Veuillez entrer le caractere suivant : ");
			monchar = clavier.next().charAt(0);
		
		}
		while(p.estPleine()) {
			char c=p.sommet();
			System.out.println(c);
			p.depiler();
			}
		//ex2:
char a;
Pile p2=new Pile();
Scanner cl = new Scanner(System.in);
a = cl.next().charAt(0);
while(a!='#') {
	if(a=='(')p2.empiler(a);
	if(a==')')p2.depiler();
	
}
}
	}


