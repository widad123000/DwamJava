public class Fenetre {
    Rectangle r;
    private String Title;
    public Fenetre(Rectangle r ,String Title){
        this.r=new Rectangle(r.getHg(),r.getBd());
        this.Title=Title;

    }
    public void  agrandissment(int x , int y){
      this.r.zoom(x,y);
    }

    public void setR(Rectangle r) {
        this.r = r;
    }
}
