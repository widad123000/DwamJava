package tp4;

import tp3.Point;

public class Rectangle extends Point {

    private Point hg, bd;

    //constructeur par défaut
    public Rectangle() {
        this.hg = new Point();
        this.bd = new Point();
    }

    public Rectangle(Point h, Point b) {
        this.hg = new Point(h);
        this.bd = new Point(b);
    }

    public void afficher() {
        System.out.println("Coin haut gauche: " + hg);
        System.out.println("Coin bas droit: " + bd);
    }

    public int surface() {
        int largeur = Math.abs(bd.getX() - hg.getX());
        int hauteur = Math.abs(bd.getY() - hg.getY());
        return largeur * hauteur;
    }

    public void zoom(int deltax, int deltay) {
        hg.setX(hg.getX() - deltax);
        hg.setY(hg.getY() - deltay);

        bd.setX(bd.getX() + deltax);
        bd.setY(bd.getY() + deltay);
    }

    public Point getHg() {
        return hg;
    }

    public void setHg(Point hg) {
        this.hg = hg;
    }

    public Point getBd() {
        return bd;
    }

    public void setBd(Point bd) {
        this.bd = bd;
    }
}
