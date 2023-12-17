package tp7;

public interface Pile {
	final int MAX = 8;
	 public void empiler(char c);
	 // Empile un char
	 public char sommet();
	 // Retourne le sommet de la pile
	 public void depiler();
	 // Retire le sommet de la pile
	 public boolean vide();
	 // Teste si la pile est vide
	 public boolean pleine();
	 // Teste si la pile est pleine

}
