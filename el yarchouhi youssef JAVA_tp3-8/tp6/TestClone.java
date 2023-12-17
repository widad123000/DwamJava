package tp6;

import javax.swing.CellEditor;

public class TestClone {
    static public void main(String[] args){
        Cellule x = new Cellule(); // x Objet Cellule
        Cellule y = (Cellule) x.clone(); // y clone de x
        x.changeMe();
        x.afficher();

        
        y.afficher();

        Cellule f = new Cellule(x);

        f.afficher();
    }
}
