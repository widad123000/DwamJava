package metier;
import java.util.ArrayList;

public class GestionEtudiants {
	private static ArrayList<Etudiant> listeEtudiants = new ArrayList<Etudiant>();

	public static ArrayList<Etudiant> getListeEtudiants() {
		return listeEtudiants;
	}

	public static void setListeEtudiants(ArrayList<Etudiant> listeEtudiants) {
		GestionEtudiants.listeEtudiants = listeEtudiants;
	}
	
}
