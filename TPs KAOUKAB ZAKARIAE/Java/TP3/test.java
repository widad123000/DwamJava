public class test {
    public static void main(String[] args) throws Exception {
       /*  Point p= new Point();
        p.setX(3);
        p.setY(4);
        System.out.println("x="+p.getX()+" y="+p.getY());*/
        Point pointA = new Point(2, 1);
        Point pointB = new Point(2, 1);
        

        System.out.println("Distance between pointA and pointB: " + pointA.distance(pointB));

        // deplacer pointA
        pointA.deplacer(3, 4);
        System.out.println("PointA after moving: (" + pointA.getX() + ", " + pointA.getY() + ")");

        // Resetting pointA
        pointA.reset();
        System.out.println("PointA after resetting: (" + pointA.getX() + ", " + pointA.getY() + ")");

        // Testing equals
        System.out.println("pointA equals pointB: " + pointA.equals(pointB));

        // Testing toString
        Point q = new Point (2,5);
        System.out.println(q.toString()); // imprime (2,5)

        Object z = new Point (2,5);
        Object w = new Point (2,5);

        System.out.println(z.equals(w)); // imprime true



    }
}
