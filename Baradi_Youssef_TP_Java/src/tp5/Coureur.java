package tp5;

public class Coureur implements Loisir{

    @Override
    public void courirOuMarcher() {
        System.out.println("Je cours "+distance+" Km.");
    }

    public void courirMoins() {
        System.out.println("Je cours "+(distance/2)+" Km.");
    }

}
