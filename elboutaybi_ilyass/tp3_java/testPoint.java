package org.tp3;

public class testPoint {
    public static void main(String[] args) {
        Point p = new Point();
        Point q = p;

        p.setX(3);
        q.setX(3);
        p.setY(4);
        q.setY(4);

        System.out.println(p.getX());
        System.out.println(p.getY());

        System.out.println(p.equals(q));

    }
}
