	package tp6;


	import java.util.ArrayList;

	public class GestionEtudiants {
	    public static ArrayList<Etudiant> getListeEtudiants() {
	        ArrayList<Etudiant> liste = new ArrayList<>();
	        liste.add(new Etudiant("mohamed", "ali", "mohamed.jpg"));
	        liste.add(new Etudiant("amine", "ahmad", "amine.jpg"));
	        liste.add(new Etudiant("abdo", "fakir", "abdo.jpg"));
	        // Add more students if needed
	        return liste;
	    }
	}
