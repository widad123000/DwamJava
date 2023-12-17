package tp7;

/**
 * InnerPile
 */
public interface Pile {
    final int MAX = 8;

    // push a char on the stack
    public void empiler(char c);
    // return the top elemnt from the stack
    public char sommet();
    // pop form the stack
    public void depiler();
    // check if the stack in empty 
    public boolean vide();
    // check if the stack if full
    public boolean pleine();

}
