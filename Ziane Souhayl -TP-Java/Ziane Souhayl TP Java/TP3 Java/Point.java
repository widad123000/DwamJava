
public class Point {
    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }

    public Point(int a, int b) {
        x = a;
        y = b;
    }
    public Point(int a) {
        this(a, 0);  
    }

    public void afficherCoordonnees() {
        System.out.println("Coordonnées du point : (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {

        Point p = new Point();
        p.afficherCoordonnees(); 

        Point q = new Point(5, 2);
        q.afficherCoordonnees();

        Point r = new Point(3);
        r.afficherCoordonnees();
        Point s = new Point();     
        s.afficherCoordonnees();
    }
}
