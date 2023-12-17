/**
* Classe Point du plan avec ses cordonnées x et y
*/
public class Point extends Object{
 private int x, y;
 public Point() {}

 public Point(int x, int y) {
    this.x = x;
    this.y = y;}

    public Point(int x) {
        this.x = x;
        this.y = 0; // Initialise y à 0
    }
    // public Point(int x) {
     //   this(x, 0);  Appelle le constructeur avec deux paramètres
    // }

    // public Point() {
      //  this(0);  Appelle le constructeur nouvellement ajouté avec un seul paramètre
    // }
 /**
 * Methode qui affecte la valeur de son
paramètre
 * au Point this.
 */
 public void setX(int p) {
 x = p;
 }
 public void setY(int p) {
 y = p;
 }
 public int getX() {
 return x;}
 public int getY() {
 return y;
 }
 public void deplacer(double dx, double dy) {
    this.x += dx;
    this.y += dy;
}

public void reset() {
    this.x = 0;
    this.y = 0;
}

public double distance(Point b) {
    double dx = this.x - b.getX();
    double dy = this.y - b.getY();
    return Math.sqrt(dx * dx + dy * dy);
}
public double distance(Point a ,Point b){
    double dx=a.getX()-b.getX();
    double dy=a.getY()-b.getY();
    return Math.sqrt(dx*dx+dy*dy);}

    
public boolean equals(Point a){
    return (this.x==a.x && this.y==a.y);
   }
   public String toString() {
    return "(" +getX() + "," +getY()+ ")" ;
   }

   public boolean equals(Object a){ // redéfinition de equals
    return (this.x == ((Point)a).x && // cast de a en Point
   this.y == ((Point)a).y ) ;           
   }
   
   
}

   

