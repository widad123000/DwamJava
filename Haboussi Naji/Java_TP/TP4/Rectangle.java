import java.awt.*;

class Rectangle {
    private Point c; // Les coins haut à gauche
       //hg
    private Point b;  // coins droit

    // rectangle par défaut. Choisir son initialisation
    public Rectangle() {
        this.c= new Point();
        this.b = new Point();
    }

    public Rectangle(Point h, Point b) {

        this.c = new Point(h);
        this.b = new Point(b);
// initialisation des coins à partir des paramètres
    }
//get cordonnees
    public void afficher() {

        System.out.println("les cordonnees de coing Gauche est :"+c.getX()+"et de hauteur:"+c.getY()+")");

    }



    public double  surface() {
// calcule de la surface
        //supposant que elle est carre

        double a =Math.sqrt((Math.pow((b.getX()-c.getX()),2)+(Math.pow((b.getY()-c.getY()),2))))*Math.sqrt((Math.pow((b.getX()-c.getX()),2)+(Math.pow((b.getY()-c.getY()),2))));
        return a;
 }

    //changement des valeur de rectangle
  public void set(Point h, Point b){
        this.c=h;
        this.b=b;
  }
  public Point GetGauche(){
        return c;
  }
    public Point GetDroite(){
        return c;
    }
    public void deplacer(int deltaX, int deltaY) {
        //getters et sitters de la class point se qui permet la modification
        c.setX(deltaX);
        c.setY(deltaY);
        b.setX(deltaX);
        b.setY(deltaY);
    }
    public void agrandir(int augment){
        //agrnadir = ancient valeur+nouveauValeur
        c.setX(c.getX()+augment);
    }

}
