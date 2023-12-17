
public class Test {
    static public void main(String[] args){
        Coureur c = new Coureur() ;
       c.courirOuMarcher();
       c.courirMoins();
       Loisir mesLoisirs[] = { new Marcheur(), new Coureur() } ;
        for(Loisir loisir : mesLoisirs){
            loisir.courirOuMarcher();

        } 

    }
    
}
    

