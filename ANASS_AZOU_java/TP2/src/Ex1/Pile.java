package Ex1;
class ExceptionFactSuperieur12 extends Throwable {};

public class Pile {

	static final int Max = 8;
	char t[];
	int top;
	
	
	public Pile() {
		
		t= new char[Max];
		top = -1;
	}
	
	public void empiler(char c) throws ExceptionPileOverflow {
		
		if(!estPleine()) {
			t[++top] = c ;}
		else {
			throw new ExceptionPileOverflow();
		}
	}
	
 
	public char sommet() throws ExceptionPileUnderflow {
		 if (top >= 0) {
		        return t[top];
		    } else {
		        throw new ExceptionPileUnderflow();
		    }
		 }
	
	
	public void depiler() throws ExceptionPileUnderflow{
		if(top == -1) {
			throw new ExceptionPileUnderflow();
			
		}
		 else {
	          
	            top--;
	            System.out.println("Top element depiled.");
	        }
		}

	public boolean estVide() {
		
		 return (top < 0);
		 }
		
		 public boolean estPleine() {
		 return (top > 0);
		 }

 };
