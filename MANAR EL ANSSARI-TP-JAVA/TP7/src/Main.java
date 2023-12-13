public class Main {
    public static void main(String[] args) {
        Cellule x = new Cellule();
        x.afficher();
        Cellule y = (Cellule) x.clone();
        Cellule z=new Cellule(x);
        //x.i=34;
        //x.afficher();
       // y.afficher();
        x.changeMe();
        x.afficher();
        y.afficher();
        z.afficher();

    }
}