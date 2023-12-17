

// aka stack
public class Pile {
    static final int MAX = 8;
    char t[];
    int top;


    // methdes
    public Pile(){
        t = new char[MAX];
        top = -1;
    }

    public void empiler(char c){
        if(!estPleine()){
            t[++top] = c;
        }else{
            System.out.println("Pile pleine");
        }
    }

    public char sommet() throws ExceptionPileUnderflow{
        if(!estVide()){
            return t[top];
        } else {
            throw new ExceptionPileUnderflow();
        }
        
    }
    
    public void depiler(){
        if(!estVide()){
            top--;
        }else{
            System.out.println("you are trying to POP from an empty stack");
        }
        
    }

    public boolean estVide(){
        if(top == -1){
            return true;
        }
        return false;
    }

    public boolean estPleine(){
        if(top == MAX -1){
            return true;
        }
        else return false;
    }

    
}
