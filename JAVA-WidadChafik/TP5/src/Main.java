public class Main {
    public static void main(String[] args) {
        Coureur c = new Coureur() ;
        c.courirOuMarcher();
        c.courirMoins();
        Loisir l=new Coureur();
        Loisir mesLoisirs[]={
                new Coureur(),
                new Marcheur(),
        };
       mesLoisirs[0].courirOuMarcher();
       mesLoisirs[1].courirOuMarcher();
       A a=new C();
       a.afficher();
       B a1=new C();
       a1.afficher();

        Speciale s = new Speciale() {
            @Override
            public void qui() {

            }
        };
        Generale g= new Speciale() {
            @Override
            public void qui() {
                
            }
        };
        s.moi();
        s.qui();
        s.x++;
        System.out.println(s.x);


    }
}