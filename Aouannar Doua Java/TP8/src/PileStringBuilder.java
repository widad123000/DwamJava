
public class PileStringBuilder implements Pile {

	
	StringBuilder s;
	public PileStringBuilder() {
		s=new StringBuilder(MAX);
	}
	public void empiler(char c) {
		if(!estPlein()) {
			s.append(c);
		}
		else {
			System.out.println("est plein");
		}
		
	}

	
	public void depiler() {
		if(!estVide()) {
			s.deleteCharAt(s.length()-1);
		}
		else {
			System.out.println("Vide");
		}
		
	}

	
	public char sommet() {
		if(!estVide()) {
		char c= s.charAt(s.length()-1);
		return c ;
		}
		return 0 ;
		
	}

	
	public boolean estVide() {
		return s.length()==0;
		
	}

	public boolean estPlein() {
		return s.length()==MAX;
	}
	public void ajoutecarachter(int i , char c) {
		s.insert(i, c);
	}
	
	public char getCharactere(int j) {
		if(j>0 && j<s.length()-1) {
			char c = s.charAt(j);	
			
		return c;
		
		}
		return 0;
		
	}

}
