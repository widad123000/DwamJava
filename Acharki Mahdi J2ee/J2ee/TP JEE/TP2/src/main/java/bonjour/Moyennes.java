package bonjour;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Moyennes")
public class Moyennes extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Moyennes Servlet</title></head><body>");

       
        List<Etudiant> etudiants = new ArrayList<>();
        etudiants.add(new Etudiant("nom1",Math.random()));
        etudiants.add(new Etudiant("nom2",Math.random()));
        etudiants.add(new Etudiant("nom3",Math.random()));

        
        for (Etudiant etudiant : etudiants) {
            out.println("<p>Nom de l'étudiant : " + etudiant.getNom() + "</p>");
            out.println("<p>Moyenne : " + etudiant.getMoyenne() + "</p>");
            out.println("<br>");
        }

        out.println("</body></html>");
    }

    
    private class Etudiant {
        private String nom;
        double moy;

        public Etudiant(String nom,double moy) {
            this.nom = nom;
            this.moy = moy;
           
        }

        public String getNom() {
            return nom;
        }

        public double getMoyenne() {
            return moy;
        }
    }
}