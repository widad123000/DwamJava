package tp5;
import tp5.Loisire;

public class Coureur implements Loisire{
    
    // imlementation of the mehtod
    public void courirOuMarcher(){
        System.out.println("je cours "+ distance + " km.");
    }
  
    public void courirMoins(){
   
        System.out.println("je cours "+ (distance/2) + " km. ");
    }
}
