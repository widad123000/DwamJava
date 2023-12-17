package tp5_classes_abstraites;

abstract class Generale {
	public int x=2; // x variable d'instance (non considérée static)
	 abstract public void qui(); // méthode abstraite à implémenter par les sous-classes
	 public void moi(){
	 System.out.println("Méthode générale");
	 }

}
