package mesClasses;

import java.util.ArrayList;
import java.util.List;

public class Etudients {
    private String nom;
    private double cin;

    public Etudients(String nom, double cin) {
        this.nom = nom;
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public double getCin() {
        return cin;
    }

    public static List<Etudients> getListeEtudiants() {
        List<Etudients> liste = new ArrayList<>();

        liste.add(new Etudients("John Doe", 123));
        liste.add(new Etudients("Jane Smith", 456));
        liste.add(new Etudients("Bob Johnson", 789));

        return liste;
    }
}