package org.tp4;

import org.tp3.Point;

public class Rectangle {
    private Point hg, bd;

    public Rectangle() {
        this(new Point(0, 0), new Point(0, 0));
    }

    public Rectangle(Point h, Point b) {
        hg = h;
        bd = b;
    }

    public void afficher() {
        System.out.println("HG(" + hg.getX() + ", " + hg.getY() + ")");
        System.out.println("BD(" + bd.getX() + ", " + bd.getY() + ")");
    }

    public int surface() {
        int width = Math.abs(bd.getX() - hg.getX());
        int height = Math.abs(bd.getY() - hg.getY());
        return width * height;
    }

    public void zoom(int deltax, int deltay) {
        hg.setX(hg.getX()-deltax);
        bd.setY(bd.getY()-deltay);
        hg.setX(hg.getX()+deltax);
        bd.setY(bd.getY()+deltay);
    }

};

