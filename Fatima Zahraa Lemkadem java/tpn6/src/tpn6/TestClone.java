package tpn6;

public class TestClone {
	public static void main(String []args) {
		Cellule x = new Cellule();
		x.afficher();
		Cellule y = (Cellule) x.clone();
		y.afficher();
		x.ChangeMe();
		x.afficher();
		y.afficher();
		
		Cellule m = new Cellule(x);
		
		m.afficher();
	}
}
