package testtest;


public class Pile {
    static final int MAX = 8;
    char t[];
    int top;

    public Pile() {
        t = new char[MAX];
        top = -1;
    }

   

    public char sommet() {
        if (!estVide()) {
            return t[top];
        } else {
           
            System.out.println("Pile vide");
            return '\0'; 
        }
    }

    public void depiler() {
        if (!estVide()) {
            top--;
        } else {
            
            System.out.println("Pile vide");
        }
    }

    public boolean estVide() {
        return top < 0;
    }

    public boolean estPleine() {
        return top == MAX - 1;
    }
    public void empiler(char c) {
        if(!estPleine()) {
            t[++top] = c;
        } else {
            System.out.println("Pile pleine");
        }
    }

    public static void main(String args[]) {
       
        Pile pile = new Pile();
        pile.empiler('A');
        pile.empiler('B');
        pile.empiler('C');

        System.out.println("Top element: " + pile.sommet());

        pile.depiler();	
        System.out.println("Top element after depiler: " + pile.sommet());
    }
}

