
public class testClone {

	public static void main(String[] args) {

		Cellule x = new Cellule();
		x.afficher();
		
		Cellule y = (Cellule) x.clone();
		y.afficher();
		
		x.changeMe();
		x.afficher();
		y.afficher();
		
        Cellule p=new Cellule(x);
		
		p.afficher();
		

	}

}
