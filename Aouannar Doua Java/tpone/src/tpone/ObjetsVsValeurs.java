package tpone;

public class ObjetsVsValeurs {
	 // Classe C
    static class C {
         int x; // Champ entier

        // Méthode pour consulter le champ x
        public int getX() {
            return x;
        }

        // Méthode pour modifier le champ x
        public void setX(int p) {
            x = p;
        }
    }

    public static void main(String[] args) {
    	
    	
    	int x = 1 , y; //affectation de valeurs
		y=x; // deux valeurs egales mais objets differents
		System.out.println("Avant (x=100): x="+x+", y=" +y);
		x=100;
		System.out.println("Avant (x=100): x="+x+", y=" +y);
		//constater que y n'as pas change
		
		int[] u = {4,5}; // tableau a deux entiers
		int[] v;
		
		// meme chose avec objet (ici tableau)
		
		v=u;
		System.out.println("avant (u[0]=100) :u[0]="+u[0]+"v[0]="+v[0]);
		u[0]=100;
		System.out.println("avant (u[0]=100) :u[0]="+u[0]+"v[0]="+v[0]);
		// constater que v[0] changer aussi
		
		
        C a = new C();
        C b = new C();

        a.setX(5);
        b.setX(6);
        System.out.println("a.x : " + a.getX() + " et b.x : " + b.getX());
        a=b;
        a.setX(4);
        System.out.println(a.getX() + " et " +b.getX());

       
    }
}