package tp4;

public class Fenetre {
    private Rectangle frame;
    private String title;

    // constractor
    public Fenetre(Rectangle frame, String title){
        this.frame = frame;
        this.title = title;
    }

    // get / set
    public void setTitle(String title){
        this.title = title;
    }
    public void setFrame(Rectangle frame){
        this.frame = frame;
    }

    public String getTitle(){
        return this.title;
    }
    public Rectangle getFrame(){
        return this.frame;
    }
}
