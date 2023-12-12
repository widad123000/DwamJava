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
public class exercice3 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Affichage des Étudiants</title></head><body>");

        
        List<Etudiant> etudiants = obtenirListeEtudiants();

        
        out.println("<h1>Liste des Étudiants</h1>");
        out.println("<table border='1'>");
        out.println("<tr><th>Nom</th><th>Cni</th><th>Moyenne</th></tr>");

        int c = 1;
        for (Etudiant etudiant : etudiants) {
        	out.println("<tr>");
        	
        	 out.println("<td>" + etudiant.getNom() + "</td>");
             out.println("<td>" + "cni "+ c + "</td>");
             out.println("<td>" + etudiant.getMoyenne() + "</td>");
   
            out.println("</tr>");
            c++;
        }
       
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