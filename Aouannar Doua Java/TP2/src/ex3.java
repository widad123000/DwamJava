class ExceptionPileUnderflow extends Throwable{}
class ExceptionPileOverflow extends Throwable{}

class Pile{
	static final int MAX=8;
	int top;
	char t[];
	
	public Pile(){
		t=new char [MAX];
		top=-1;
	}
	public void empiler(char c) throws ExceptionPileOverflow   {
		 if (!estPleine())
	            t[++top] = c;
	        else
	            throw new ExceptionPileOverflow();
	    }


  public void depiler() throws ExceptionPileUnderflow  {
	  if(!estVide())
		  top--;
	  else
		  throw new ExceptionPileUnderflow();
  }
  
  public char sommet() throws ExceptionPileUnderflow {
	  if(!estVide()) 
		  return t[top];
	  else
		  throw new ExceptionPileUnderflow();
  }
  public boolean estPleine() {
	  return (top==MAX-1);
  }
  public boolean estVide() {
	  return top<0;
  }

	

	public static void main(String[] args) {
		Pile p = new Pile();
		try {
			
		p.empiler('A');
		p.empiler('d');
		System.out.println(p.sommet());
		p.depiler();
		}
		catch( ExceptionPileUnderflow e) {
			System.out.println("la pile est vide");
			e.printStackTrace();
		}catch( ExceptionPileOverflow e) {
			System.out.println("la pile est plein");
			e.printStackTrace();
		}

	

}}
