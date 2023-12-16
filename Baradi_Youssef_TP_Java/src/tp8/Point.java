package tp8;


public class Point implements MonApi{
    protected int x, y;

    @Override
    public void print() {
        System.out.printf("(%d, %d)\n", x, y);
    }

    @Override
    public String convTexte() {
        return String.format("{x:%d, y:%d}", x, y);
    }

    @Override
    public int compare(Object o) {

        Point p = (Point) o;
        if (x > p.x)
            return 1;
        else if (x < p.x)
            return -1;
        else if (y > p.y)
            return 1;
        else if (y < p.y)
            return -1;
        else
            return 0;
    }

    public Point() {

        x = 0;
        y = 0;
    }
    public Point(int v) {
        this.x = v;
        this.y = 0;
    }


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Constructeur par copié
    public Point(Point p){

        this.x = p.x;
        this.y = p.y;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public void deplacer(int nx, int ny){
        x += nx;
        y += ny;
    }

    public void reset(){
        x = 0; y = 0;
    }

    public double distance (Point b){
        double dx = b.x - this.x;
        double dy = b.y - this.y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    public static double distance(Point a, Point b){
        double dx = b.x - a.x;
        double dy = b.y - a.y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString(){
        return "( "+ x + " , " + y +" )";
    }

    @Override
    public boolean equals(Object obj) {
        Point point = (Point) obj;
        return x == point.x && y == point.y;
    }

}
