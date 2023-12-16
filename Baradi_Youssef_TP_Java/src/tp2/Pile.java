package tp2;

/**
 * La classe Pile est une structure de données qui représente une pile.
 * Une pile est une liste d'éléments dans laquelle les éléments sont ajoutés
 * et supprimés uniquement d'un seul côté, le sommet.
 * @author     Youssef Baradi
 */

public class Pile {

    static final int MAX = 8;
    char[] t;
    int top;

    /**
     * Constructeur par défaut qui initialise une pile vide.
     */
    public Pile() {
        // Initialise une pile vide
        t = new char[MAX];
        top = -1;
    }

    /**
     * Empile le caractère donné
     * @param c le caractère à empiler
     */
    public void empiler(char c) throws ExceptionPileOverflow{

        if (!estPleine()) {
            top++;
            t[top] = c;
        }
        else {
            throw new ExceptionPileOverflow("erreur, vous ne pouvez pas empiler car la pile est pleine");
        }
    }

     /**
     * Renvoit le caractère situé au sommet de la pile
     * @return le caractère situé au sommet de la pile
     */
    public char sommet() throws ExceptionPileUnderflow {
        if (!estVide()){
            return  t[top];
        }
        else
            throw new ExceptionPileUnderflow("Erreur ,la pile est vide!");
    }

    /**
     * Retire le caractère situé au sommet de la pile
     */
    public void depiler() throws ExceptionPileUnderflow{
        if (!estVide()){
            top--;
        }else{

            throw new ExceptionPileUnderflow("erreur vous ne pouvez pas deplier la pile est vide");
        }
    }

    /**
     * Renvoit vrai si la pile est vide, faux sinon
     * @return vrai si la pile est vide, faux sinon
     */
    public boolean estVide() {

        return  (top == -1);
    }

    /**
     * Renvoit vrai si la pile est pleine, faux sinon
     * @return vrai si la pile est pleine, faux sinon
     */
    public boolean estPleine() {

        return (top == 7);
    }

    public void affichePile(){

        for (char c : t){

            if (c != '\0') System.out.print(c + "\t");
        }

    }

    public int size(){

        int conter = 0;

        for(int i = 0; i < t.length; i++){
            conter++;
        }

        return conter;
    }
}
