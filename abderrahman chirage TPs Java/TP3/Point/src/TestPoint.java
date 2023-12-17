public class TestPoint {
    static public void main(String args[]) {
        Point p = new Point();
        p.setX(1);
        p.setY(2);
        System.out.println(p.getX());
        System.out.println(p.getY());
        Point p1 = new Point();
        p1.setX(2);
        p1.setY(3);
        double distance = p.distance(p1);
        System.out.println(distance);
        double dis = p.distance(p,p1);
        System.out.println(dis);
        boolean égalité = p.equals(p1);
        System.out.println(égalité);
        Point q = p;
        System.out.println(p.equals(q));
        Point p2 = new Point();
        Point q1 = new Point(5,2);
        Point q2 = new Point (2,5);
        System.out.println(q2.toString());
    }


};
