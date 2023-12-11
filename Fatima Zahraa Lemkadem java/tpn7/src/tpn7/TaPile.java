package tpn7;

public class TaPile implements Pile{
	private char[] t ; 
	private int sommet ;
	 public TaPile() {
		 t = new char[MAX];
		 sommet = -1 ;
	 }
	@Override
	public void empiler(char c) {
		if(!pleine()) {
			sommet++ ;
			t[sommet]= c ;
		}
		else
			System.out.println("la pile est pleine");
	}
	
	@Override
	public char sommet() {
		if(!vide())
		return t[sommet];
		else
			return '\0';
	}
	@Override
	public void depiler() {
		if(!vide()) {
			sommet--;
		}
		else
			System.out.println("la pile est vide !");
		
	}
	@Override
	public boolean vide() {
		return (sommet == -1);
	}
	@Override
	public boolean pleine() {
		return (sommet == MAX -1);
	}
	 
	
	

}
