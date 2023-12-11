package web2;

import java.util.ArrayList;
import java.util.List;

public class Gestionetd {
	private static List<Etudiant> listeEtudiants = new ArrayList<>();

    public static List<Etudiant> getListeEtudiants() {
        return listeEtudiants;
    }

    public static void ajouterEtudiant(Etudiant etudiant) {
        listeEtudiants.add(etudiant);
    }

}
