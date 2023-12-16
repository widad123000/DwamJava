package tp4;

import tp3.Point;

public class TestRectangle {

    public static void main(String[] args) {

        Rectangle rec1 = new Rectangle();
        rec1.afficher();
        System.out.println("La surface de rec1 est: " + rec1.surface());
        System.out.println();

        Point pointHg = new Point(2, 3);
        Point pointBd = new Point(5, 7);

        Rectangle rec2 = new Rectangle(pointHg, pointBd);

        System.out.println("Rectangle 2:");
        rec2.afficher();
        System.out.println("Surface: " + rec2.surface());
        System.out.println();

        System.out.println("Zoom sur le rectangle:");
        rec2.zoom(1, 1);
        rec2.afficher();
        System.out.println("Surface après zoom: " + rec2.surface());
        System.out.println();


    }
}
