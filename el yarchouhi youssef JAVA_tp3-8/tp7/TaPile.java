package tp7;

public class TaPile implements Pile{
    private char[] stack;
    private int top; // index fo the top element int the stack

    // constracotr
    public TaPile(){
        stack = new char[MAX];
        top = -1; // Stack is initially empty
    }
    // push a char on the stack
    public void empiler(char c){
        if(!pleine()){
            stack[++top] = c;
        } else {
            System.out.println("the stack in full!");
        }
    }
    // return the top elemnt from the stack
    public char sommet(){
        if(!vide()){
            return stack[top];
        } else {
            System.out.println("the stack is empty");
            return '\0';
        }
    }
    // pop form the stack
    public void depiler(){
        if(!vide()){
            top--;
        } else {
            System.out.println("the stack is empty");
        }
    }
    // check if the stack in empty 
    public boolean vide(){
        return top == -1;
    }
    // check if the stack if full
    public boolean pleine(){
        return top == (MAX - 1);
    }
}
