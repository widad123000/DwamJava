package tp5.ma;

public class Coureur  implements Loisir {
	 //Implémentation de la méthode courirOuMarcher
	public void courirOuMarcher(){
	 System.out.println("Je cours "+distance+" Km.");
	 }
	
	public void courirMoins() {
		//distance /= 2; !impossible
		 System.out.println("Je cours "+(distance/2)+" Km.");
		}
	
	
	
	};

