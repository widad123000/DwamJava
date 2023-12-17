public class Point implements MonApi {
    // la class point qui aplique l'interface monapi
    private int x;
    private int y;
    // Champs et constructeurs de la classe Point (non fournis ici)
    Point(int x1,int y1){
        this.x=x1;
        this.y=y1;
    }
    public void print() {
        System.out.printf("(%d, %d)\n", x, y);
    }

    public String convTexte() {
        return "{x:" + x + ", y:" + y + "}";
    }

    public int compare(Object o) {
        Point p = (Point) o;
        // Comparaison basée sur les coordonnées x
        if (this.x > p.x)
            return 1;
        else if (this.x < p.x)
            return -1;
        else
            return 0;
    }
}
