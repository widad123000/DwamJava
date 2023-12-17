package metier;

import java.util.ArrayList;

public class GestionEtudiants {

	private static ArrayList<Etudiant> listeEtudiants = new ArrayList<>();
	
	public static ArrayList<Etudiant> getListeEtudiants() {
		return listeEtudiants;
	}
}
