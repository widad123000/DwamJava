package tp3;

import java.util.ArrayList;
import java.util.List;

public class GestionEtudiants {
    private static List<Etudiant> listeEtudiants = new ArrayList<>();

    public static List<Etudiant> getListeEtudiants() {
        return listeEtudiants;
    }

    // Méthode pour ajouter des étudiants à la liste
    public static void ajouterEtudiant(Etudiant etudiant) {
        listeEtudiants.add(etudiant);
    }
}
