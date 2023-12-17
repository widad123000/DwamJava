package tp7;

public class MaPile implements Pile {
    private StringBuilder stack;

    // constractor
    public MaPile(){
        stack = new StringBuilder(MAX);
    }
    // push a char on the stack
    public void empiler(char c){
        stack.append(c);
    }
    // return the top elemnt from the stack
    public char sommet(){
        if(!vide()){
            return stack.charAt(stack.length()-1);
        }
        System.out.println("you are trying to peek from an empty stack!");
        return '\0';
    }
    // pop form the stack
    public void depiler(){
        if(!vide()){
            stack.deleteCharAt(stack.length()-1);
        }else{
            System.out.println("you are trying to pop from an empty stack!");
        }
        
    }
    // check if the stack in empty 
    public boolean vide(){
        return stack.length() == 0;
    }
    // check if the stack if full
    public boolean pleine(){
        return stack.length() >= MAX;
    }
}
