package tpn4;

public class Polymorphe {

	public static void main(String[] args) {
		Article [] chariot = {
				new Article(1, "Pomme", 10, 100 ),
				new ArticleLuxe(2, "iPhone", 200, 100),
				new Vetements(3, "Pull", 30, 100, "xl", "Violet"),
		};
		
		double montant = 0; 
		for ( Article p : chariot) {
			montant += p.prixTTc();
		}
		System.out.println(montant);
		
	}

}
