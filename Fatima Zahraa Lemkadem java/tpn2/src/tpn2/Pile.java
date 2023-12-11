package tpn2;



public class Pile {
	static final int Max = 8 ; 
	char t[] ;
	int top ;
	int capacite ;
	
	public Pile( int capacite) {
		t = new char[Max];
		top=-1;
		this.capacite=capacite;
	}
	
	public  boolean estVide() {
		return (top < 0);
	}
	public boolean estPleine() {
		return top == t.length - 1 ;
	}
	
	public char sommet () {
		return t[top];
	}
	
	public char depiler() {
		if(top == -1) {
			throw new ExceptionPileUnderflow("debordement par bas (pile vide)");
		}
		else
			return t[top--];
	}
	
	public void empiler(char c){
		if(top == capacite-1)
		{
			throw new ExceptionPileOverflow("debordement par haut (pile pleine)");
		}
		else 
			t[++top]=c;
	}
	
	public String toString(){
		String a = " ";
		for(int i=0 ; i <= top;i++) {
			a = a + t[i];
		}
		return a ;
	}
	public char pop() {
		if(top == -1) {
			throw new ExceptionPileUnderflow("debordement par bas (pile vide");
		}
		else	
		return t[top];
	}
}


