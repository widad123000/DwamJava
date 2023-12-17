package tp4;
/**
 * Represents a point in 2D plane with x and y
 */
public class Point extends Object {
    private int x, y;

    /**
     * Default constructor calling the single parameter constructor
     * Initializes with a default value of 0 for x-coordinate
     */
    public Point(){
        this(0);
    }
    /**
     * Constructor initialize the x and y coordinates to (a,b)
     * @param a the value that we will give to x
     * @param b the value that we will give to y
     */
    public Point(int a, int b){
        x = a;
        y = b;
    }
    /**
     * Constructor initialize the x to the a value, and y to 0
     * @param a the value that we will give to x
     */
    public Point(int a){
        this.x = a;
        this.y = 0;
    }
    /**
     * Copy constructor
     * @param p the point the we recreate into the new point
     */
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    
    /**
     * Sets the x-coordinate of the point
     * @param p the x-coordinate value to set
     */
    public void setX(int p){
        x = p;
    }
    /**
     * Sets the y-coordinate of the point
     * @param p the y-coordinate value to set
     */
    public void setY(int p){
        y = p;
    }
    /**
     * Gets the x-coordinate of the point
     * @return The x-coordinate value
     */
    public int getX(){
        return x;
    }
    /**
     * Gets the y-coordinate of the point
     * @return the y-coordiante value
     */
    public int getY(){
        return y;
    }

    // Methods
    /**
     * Moves the coordinate of the point
     * @param dx the value added to the x-coordinate 
     * @param dy the value added to the y-coordinate 
     */
    public void move(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }
   
    /**
     * Reset the values of the coordinates to the origin (0,0).
     */
    public void reset(){
        x = 0;
        y = 0;
    }
    
    /**
     * Calculate the distance between two Points (non-static)
     * @param b a Point Object
     * @return the Distance as a double value
     */
    public double distance(Point b){
        int dx = this.x - b.getX();
        int dy = this.y - b.getY();

        return Math.sqrt(dx * dx + dy * dy);
    }
    
    /**
     * Calculate the distance between two Points (static)
     * @param a the First Point
     * @param b the Second Point
     * @return the Distance as a double value
     */
    public static double distance(Point a, Point b){
        int dx = a.getX() - b.getX();
        int dy = a.getY() - b.getY();

        return Math.sqrt(dx * dx + dy * dy);
    }

    // Override of equals
    /**
     * overriding equals() Method
     * @param a of type Object
     * @return boolean exception
     */
    @Override 
    public boolean equals(Object a){
        
        return (this.x == ((Point)a).x && this.y == ((Point)a).y);
    }
    /**
     * overriding toString() Method
     * @return a the object as string
     */
    @Override
    public String toString(){
        return "(" + x + "," + y + ")" ; 
    }



}
