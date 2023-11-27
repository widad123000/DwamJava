package org.tp4;

import org.tp3.Point;

public class testRectangle {
    public static void main(String[] args) {
        Point p1 = new Point(5, 3);
        Point p2 = new Point(3, 7);

        Rectangle rect = new Rectangle(p1, p2);

        rect.afficher();

        System.out.println(rect.surface());

        rect.zoom(5, 2);

        rect.afficher();
    }
}
