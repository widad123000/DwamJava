package tpn2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Pile p = new Pile(10) ;
		char c;
		 Scanner scanner = new Scanner(System.in);
		 System.out.println(" entrer c : (# pour terminer )");
		 c = scanner.next().charAt(0);
		 
		 while(c!='#')
		 {
			 p.empiler(c);
			 c = scanner.next().charAt(0);
			 
		 }
			 c = p.pop() ;
			 System.out.println(c);
			 
		 scanner.close();
	}
	
}
