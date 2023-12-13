public class Point {
    protected double x,y;
    Point (double x, double y){
        this.x=x;
        this.y=y;

    }
    Point (double a){
        this(a,0);
    }

    public Point(){this(0);}
    @Override
    public boolean equals(Object obj) {
        Point p=(Point)obj;
        return ((this.x==p.x) && (this.y==p.y));
    }
    public String toString() {
        return "(" + x + "," + y + ")" ;
    }
    Point (Point p) {
        this.x=p.x;
        this.y=p.y;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}

