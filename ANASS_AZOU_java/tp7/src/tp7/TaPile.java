package tp7;



class TaPile implements Pile {
	static final int Max = 8;
	char t[];
	int top;
	
	
	public TaPile() {
		
		t= new char[Max];
		top = -1;
	}
	
	public void empiler(char c)  {
		
		if(!pleine()) {
			t[++top] = c ;}
		else {
			System.out.println("Pile Overflow: The stack is full.");
		}
	}
	
 
	public char sommet()  {
		
		        return t[top];
	
		 }
	
	
	public void depiler() {
		if(top == -1) {
			System.out.println("Pile underflow: The stack is empty.");

			
		}
		 else {
	          
	            top--;
	            System.out.println("Top element depiled.");
	        }
		}

	public boolean vide() {
		
		 return (top < 0);
		 }
		
		 public boolean pleine() {
		 return (top > 0);
		 }

}
