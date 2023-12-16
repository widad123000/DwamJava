package tp5;

public abstract class Generale {

    public int x=2;
    abstract public void qui(); //méthode abstraite à implémenter par les sous-classes
    public void moi(){
        System.out.println("Méthode générale");
    }
}
