package tp4;

public class Rectangle {
    private Point tl, br; // top-left and bottom-right corners

    public Rectangle(){
        Point p = new Point();
        tl = p;
        br = p;
    }
    public Rectangle(Point t, Point b){
        tl = t;
        br = b;
    }

    // get / set
    public void setTl(Point p){
        tl.setX(p.getX());
        tl.setY(p.getY());
    }
    public void setBr(Point p){
        br.setX(p.getX());
        br.setY(p.getY());
    }

    public Point getTl(){
        return this.tl;
    }
    public Point getBr(){
        return this.br;
    }

    public void afficher(){
        System.out.println("top-left: "+ tl +"\nbottom-right: "+ br +" .");
    }

    public int surface(){
        int width = Math.abs(br.getX() - tl.getX());
        int height = Math.abs(br.getY() - tl.getY());
        return (width * height);
    }

    public void zoom(int deltax, int deltay){
        tl.setX(tl.getX() + deltax);
        tl.setY(tl.getY() + deltay);
    
        br.setX(br.getX() + deltax);
        br.setY(br.getY() + deltay);
    }
}
