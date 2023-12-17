class Rectangle {
    private Point hg, bd;

    public Rectangle() {
        hg=new Point();
        bd=new Point();
    }

    public Rectangle(Point h, Point b) {
        hg = new Point(h);
        bd = new Point(b);
    }

    public void afficher() {
        System.out.println("les cordonnes de rectangle sont :[ "+ hg.getX()+","+hg.getY()+"], " +"[ "+bd.getX()+","+bd.getY()+"]");

    }


    public double surface() {
     return ((bd.getX()-hg.getX())*(hg.getY()-bd.getY()));
    }

    public void zoom(int deltax, int deltay) {
           hg.setX(hg.getX()+deltax);
           hg.setY(hg.getY()+deltay);
           bd.setX(bd.getX()+deltax);
           bd.setY(bd.getY()+deltay);
    }
    Point getHg()
    {
        return hg;
    }
    Point getBd()
    {
        return bd;
    }
    void setHg(Point hg)
    {
        this.hg=new Point(hg);
    }
    void setBd(Point bd)
    {
        this.bd=new Point(bd);
    }


};
