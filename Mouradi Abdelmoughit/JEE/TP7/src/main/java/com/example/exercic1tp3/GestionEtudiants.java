package com.example.exercic1tp3;

import com.example.exercic1tp3.Etudiant;

import java.util.ArrayList;

public class GestionEtudiants {
   ArrayList<Etudiant> listeEtudiants = new ArrayList<Etudiant>();
   public  void AddEtudiant(Etudiant e){
       listeEtudiants.add(e);
   }
  public  ArrayList<Etudiant> getListeEtudiants(){
      return listeEtudiants;
  }
}

