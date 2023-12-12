package com.example.exercic1tp3;

public class Etudiant {
    private String Cin;
    private String Nom;
    private Double Moyenne;
    public Etudiant(String cin,String nom,double moyenne) {
       this.Cin = cin;
       this.Nom = nom;
       this.Moyenne = moyenne;
    }
    public String getCin() {
        return Cin;
    }
    public void setCin(String cin) {
        Cin = cin;
    }
    public String getNom() {
        return Nom;
    }
    public void setNom(String nom) {
        Nom = nom;
    }
    public Double getMoyenne() {
        return Moyenne;
    }
    public void setMoyenne(Double moyenne) {
        Moyenne = moyenne;
    }
    public boolean equals(Etudiant etudiant) {
        if (this.Cin==etudiant.Cin){
            return true;
        }else {
            return false;
        }
    }
}
