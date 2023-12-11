package tpn5;

public class Test {
	public static void main(String []args) {
	Coureur C = new Coureur() ;
	ILoisir L = new Coureur();
	
	C.CourirOuMarcher();
	C.CourirMoins();
	L.CourirOuMarcher();
	
	ILoisir mesLoisirs [] = {
		 new Coureur(), new Marcheur() 
	};
	
	for(ILoisir Loisir:mesLoisirs) {
		Loisir.CourirOuMarcher();
	}
	
	
	}
	
}
