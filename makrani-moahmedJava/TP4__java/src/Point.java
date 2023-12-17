/**
 * Classe Point du plan avec ses cordonnées x et y
 */
public class Point {
    private int x;
    private int y;
    //constructor
    public Point()
    {
        this.x=x;
        this.y=y;
    }
    //constructeur avec parametre
    public Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    //par copy
    public Point (Point point){
        this.x=point.x;
        this.y=point.y;
    }
    /* Methode qui affecte la valeur de son
     paramètre
     * au Point this.
     */
    public void setX(int x ) {
        this.x = x;

    }
    public void setY(int p) {
        y = p;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public String toString() {
        return "(" + x + "," + y + ")" ;
    }


};