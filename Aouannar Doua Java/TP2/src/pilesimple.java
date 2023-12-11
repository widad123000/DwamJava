
import java.util.Scanner;

public class pilesimple {
	// declaration des attributs de la pile
	
	static final int MAX =8;
	char t[];
	int top;
	
	//programation des operations(methode)de la pile
	
	public pilesimple(){
		//initialise une pile vide
		t=new char[MAX];
		top=-1;
	}
	public void empiler(char c) {
		if(!estPleine()) {
			t[++top]=c;
		}
		else {
			System.out.println("Pile pleine");
		}
	}
	public char sommet() {
        
        if (!estVide())
            return t[top];
        else {
            System.out.println("La pile est vide");
            return '\0'; 
        }
    }
		
	
	public void depiler() {
		//decapite la pile (retire le sommet)
		// a competer..
		
		if(!estVide()) {
			top--;
		}
		else {
			System.out.println("la pile est vide");
		}
	}
	public boolean estVide() {
		//teste si la pile est vide 
		return (top<0);
	}
	public boolean estPleine() {
		//teste si la pile est pleine 
		// a competer..
		return (top==MAX-1);
	}
	
	public String toString() {
		String a ="";
		for (int i=0;i<=top;i++) {
			a=a+t[i];
		}
		return a;
	}



public static void main(String[] args) {
	pilesimple P = new pilesimple();
	Scanner sc = new Scanner(System.in);
	
	P.empiler('D');
	P.empiler('O');
	P.empiler('U');
	P.empiler('A');
	P.empiler('E');
	P.empiler('V');
	
	P.depiler();
	
	System.out.println(P.sommet());
	
	System.out.println(P.estVide());
	P.toString();
}

}