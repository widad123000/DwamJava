package tpn7;


public class MaPile implements Pile {
	private static final int MAX= 8;
	private StringBuilder s ; 
	private StringBuilder reversedString ;
	
	public MaPile() {
		s = new StringBuilder(MAX);
		reversedString = new StringBuilder();
	}
	
	public void empiler(char c) {
		s.insert(0,c);
	}
	public boolean vide() {
		return s.length()==0;
	}
	
	public boolean pleine() {
		return s.length()==MAX;		
	}
	
	public void depiler() {
		if(!vide()) {
			s.deleteCharAt(0);
		}
		else {
			System.out.println("la pile est vide !");
		}
	}
		
	public char sommet() {
		if(!vide()) {
		return s.charAt(0);
		}
		else
		{
			return '\0' ;
		}
	}
}
