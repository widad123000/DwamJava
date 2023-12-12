package TP3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AffichageEtudiants")
public class exercice2 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Affichage des Étudiants</title></head><body>");

        
        List<Etudiant> etudiants = obtenirListeEtudiants();

        
        out.println("<h1>Liste des Étudiants</h1>");
        out.println("<ul>");
        for (Etudiant etudiant : etudiants) {
    
            out.println("<li>"+etudiant.getNom() + " cin " + etudiant.getMoyenne()+"</li>");
           
            
        }
        out.println("</ul>");
       
    }

   
    private List<Etudiant> obtenirListeEtudiants() {
        List<Etudiant> etudiants = new ArrayList<>();
        etudiants.add(new Etudiant("John Doe",Math.random()));
        etudiants.add(new Etudiant("Jane Doe",Math.random()));
        etudiants.add(new Etudiant("Alice Smith",Math.random()));
        return etudiants;
    }

 
    private class Etudiant {
        private String nom;
        double cin;

        public Etudiant(String nom,double cin) {
            this.nom = nom;
        this.cin = cin;    
        }

        public String getNom() {
            return nom;
        }

        public double getMoyenne() {
            return cin;
        }
    }
}