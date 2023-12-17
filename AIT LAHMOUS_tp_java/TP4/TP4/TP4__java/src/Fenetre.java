public class Fenetre {
    private Rectangle rectangle;
    private String titre;

    public Fenetre(Rectangle rectangle, String titre) {
        this.rectangle = rectangle;
        this.titre = titre;
    }

    //  déplacer la fenêtre
    public void deplacer(int deltaX, int deltaY) {
        rectangle.deplacer(deltaX, deltaY);
    }

    // Méthode pour agrandir la fenêtre en utilisant la méthode de la classe Rectangle
    public void agrandir( int deltaY) {
        rectangle.agrandir( deltaY);
    }}