package tp6;

import javax.swing.CellEditor;

public class Cellule extends Object implements Cloneable{
    // donnes
    int i = 0;
    int[] t = {1, 2};
    // constractor
    public Cellule(){}
    // copy constractor
    public Cellule(Cellule x){
        this.i = x.i;
        for(int i=0; i<t.length; i++){
            this.t[i] = x.t[i];
        }
    }

    // Methodes
    public Object clone(){
        Cellule tmp = new Cellule();
        tmp.i = i;
        // clone the table
        tmp.t = (int []) this.t.clone();
        return tmp;
    }
    // display method
    public void afficher(){
        System.out.println(i +" "+ t[0] +" "+ t[1]);
    }

    // changeMe()
    public void changeMe(){
        i = 10;
        t[0] = 11;
        t[1] = 12;
    }
}
