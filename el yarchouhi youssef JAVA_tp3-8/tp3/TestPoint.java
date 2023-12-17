package tp3;

public class TestPoint {
    public static void main(String[] args){

        Point p = new Point(1,2); 

        Point q = new Point(2,3); 
        // Point q = p;

        // get the distance with non-static method
        System.out.println("non-static | distance between p and q = " + p.distance(q));
        // get the distance with static method
        System.out.println("static     | distance between p and q = " + Point.distance(p, q));

        // equals
        System.out.println("the opjects p and q are equale: "+p.equals(q));

        System.out.println(q);

        Object u = new Point(2,5);
        Object o = new Point(2,5);

        System.out.println("u and o are equal : "+u.equals(o));
    }
}
