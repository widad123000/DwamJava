package tp5.ma;

public class Test {

	static public void main(String args[]){
		Coureur c = new Coureur();

			// Loisir c = new Coureur(); possible
			 //Loisir l = new Loisir();!impossible
			 c.courirOuMarcher();
			 c.courirMoins();//impossible avec Loisir c = new Coureur() car elle n'est pas declarer dans loisir
			 Loisir mesLoisirs[] = { new Marcheur(), new Coureur() } ;
			 for (Loisir loisir : mesLoisirs) {
		            loisir.courirOuMarcher();
		        }
			 
			 
			 C a = new C();
		        a.f();
		        a.g();
		        // Accès aux constantes x des interfaces A et B
		        System.out.println("Valeur de x de l'interface A: " + A.x);
		        System.out.println("Valeur de x de l'interface B: " + B.x);
		      
		        
		        Speciale1 s = new Speciale1();
		        s.moi();//affiche la class special1
		        s.qui();
		        s.x++;
		        System.out.println(s.x);
		        
			 }
	
	
	
	 
}
