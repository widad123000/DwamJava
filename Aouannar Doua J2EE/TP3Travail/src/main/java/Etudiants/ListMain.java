package Etudiants;


import java.util.List;

public class ListMain {

    public static void initialiserListeEtudiants() {
        Etudiant et1 = new Etudiant("nom", "1", 12.0,"flutter.jpeg");
        Etudiant et2 = new Etudiant("nom", "2", 14.0,"flutter.jpeg");
        Etudiant et3 = new Etudiant("nom", "3", 9.0,"flutter.jpeg");
        Etudiant et4 = new Etudiant("nom", "4", 15.0,"flutter.jpeg");
        Etudiant et5 = new Etudiant("nom", "5", 8.0,"flutter.jpeg");

        List<Etudiant> listeEtudiants = GestionEtudiants.getListeEtudiants();
        listeEtudiants.add(et1);
        listeEtudiants.add(et2);
        listeEtudiants.add(et3);
        listeEtudiants.add(et4);
        listeEtudiants.add(et5);
    }
}
