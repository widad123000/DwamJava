package tp7;

import java.util.Scanner;



class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner scnr= new Scanner(System.in);
		a = scnr.nextInt();
		MaPile p= new MaPile(a);
		char c;
		
		int s;
		s=Integer.parseInt(scnr.next());
		System.out.println("Enter characters, '#' to stop:");
		c =scnr.next().charAt(0);		
		
		
		while (c != '#') {
	         p.empiler(c);
	         c = scnr.next().charAt(0);
	     }
		while(!p.vide()) {
			c=p.sommet() ;
			System.out.println(c);
			p.depiler(); 
	}

}
}
