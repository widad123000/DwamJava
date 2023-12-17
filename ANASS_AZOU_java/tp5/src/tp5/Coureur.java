package tp5;

class Coureur implements Loisir {
	final int distance = 2;
	 //Implémentation de la méthode courirOuMarcher
	public void courirOuMarcher(){
	 System.out.println("Je cours "+distance+" Km.");
	 }
	
	public void courirMoins() {
		 System.out.println("Je cours "+(distance/2)+" Km.");
		}
}
