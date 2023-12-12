public class Point {

    private int x , y ;           /* Les cordonnés d'une point */


    public Point()              /* Initialise un point à l'origine */
        {this (0,0);}


    public Point(int a, int b){            /* Initialise un point à a et b */
        x = a; y = b;
    }

    public Point(int a){            /* Initialise un point à a et 0 */
        x = a; y = 0;
    }


    public void setX(int x) {      /* la methode setter de X */
        this.x = x;
    }
    public void setY(int y) {      /* la methode setter de Y */
        this.y = y;
    }
    public int getX() {             /* la methode getter de X */
        return x;
    }
    public int getY() {             /* la methode getter de Y */
        return y;
    }
    public int déplacerX(int x){     /* Une methode pour deplacer votre point dans l'Axe des abcices */
        int Dx = this.x + x;
        return Dx;
    }
    public int déplacerY(int y){      /* Une methode pour deplacer votre point dans l'Axe des Ordonnée */
        int Dy = this.y + y;
        return Dy;
    }
    public void reset(){              /* Une methode pour ramener un point à l'origine */
        this.x = 0;
        this.y = 0;
    }
    public double distance (Point b){   /* Une methode qui calcule la distance Une paramettre*/
        double res = Math.sqrt( Math.pow(( this.x - b.getX() ),2) + Math.pow(( this.y - b.getY() ),2));
        return res;
    }
    public static double distance (Point a, Point b){       /* Une methode qui calcule la distance deux paramettres*/
        double res = Math.sqrt( Math.pow(( a.getX() - b.getX() ),2) + Math.pow(( a.getY() - b.getY() ),2));
        return res;
    }


    public boolean equals(Object a){                    /* Une methode qui tester l'égalité des cordonnée des points */
        return (this.x == ((Point)a).x && this.y == ((Point)a).y ) ;
    }


    @Override
    public String toString() {
        return "Les cordonnées sont (" + x + "," + y + ")" ;
    }

    public static void main(String[] args) {

        }
}
