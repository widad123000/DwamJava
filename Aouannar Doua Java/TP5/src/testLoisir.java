
public class testLoisir {

	public static void main(String[] args) {
		Coureur c = new Coureur() ;
		
		c.CourirOuMarcher();
		c.CourirMoins();
		
		Loisir l = new Coureur() ;
		l.CourirOuMarcher();

		Loisir mesloisir []={
				new Coureur(),
				new Marcheur()
		};
		for (Loisir loisir : mesloisir) {
			loisir.CourirOuMarcher();
		}

		

		

	}

}
