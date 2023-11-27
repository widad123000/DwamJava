package tp3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AffichageEtudiants")
public class AffichageEtudiants extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.print("<html><body>");

        List<Etudiant> listeEtudiants = GestionEtudiants.getListeEtudiants();
        listeEtudiants.add(new Etudiant("CIN1", "Etudiant1", 12.5, "image1.jpg"));
        listeEtudiants.add(new Etudiant("CIN2", "Etudiant2", 14.0, "image2.jpg"));
        listeEtudiants.add(new Etudiant("CIN3", "Etudiant3", 9.8, "image3.jpg"));
        listeEtudiants.add(new Etudiant("CIN4", "Etudiant4", 16.3, "image4.jpg"));

        // Exercice 1 : Affichage simple
        afficherEtudiants(out, listeEtudiants);
        
        // Exercice 2 : Affichage dans une liste à puces
        afficherListeAPucesEtudiants(out, listeEtudiants);
        
        // Exercice 3 : Affichage dans un tableau
        afficherTableauEtudiants(out, listeEtudiants);
        

        // Exercice 4 : Insertion d'image
        afficherTableauAvecImages(request, out, listeEtudiants);

        // Exercice 5 : Coloration conditionnelle
        afficherTableauAvecColoration(request,out, listeEtudiants);

        out.print("</body></html>");
    }

    private void afficherTableauEtudiants(PrintWriter out, List<Etudiant> listeEtudiants) {
    	  out.print("<table border='1'>");
          out.print("<tr><th>Nom</th><th>CIN</th><th>Moyenne</th></tr>");
          for (Etudiant etudiant : listeEtudiants) {
              out.print("<tr>");
              out.print("<td>" + etudiant.getNom() + "</td>");
              out.print("<td>" + etudiant.getCin() + "</td>");
              out.print("<td>" + etudiant.getMoyenne() + "</td>");
              out.print("</tr>");
          }
          out.print("</table>");
          out.print("<br>");
		
	}

	private void afficherEtudiants(PrintWriter out, List<Etudiant> listeEtudiants) {
        
        for (Etudiant etudiant : listeEtudiants) {
            
            out.print( etudiant.getNom()+"  ");
            out.print( etudiant.getCin()+"  ");
            out.print( etudiant.getMoyenne());
            out.print("<br>");
        }
      
      
    }

    private void afficherListeAPucesEtudiants(PrintWriter out, List<Etudiant> listeEtudiants) {
        out.print("<ul>");
        for (Etudiant etudiant : listeEtudiants) {
            out.print("<li>" + etudiant.getNom() + " " + etudiant.getCin() + " " + etudiant.getMoyenne() + "</li>");
        }
        out.print("</ul>");
        out.print("<br>");
    }

    private void afficherTableauAvecImages(HttpServletRequest request, PrintWriter out, List<Etudiant> listeEtudiants) {
        out.print("<table border='1'>");
        out.print("<tr><th>Nom</th><th>CIN</th><th>Moyenne</th><th>Image</th></tr>");
        for (Etudiant etudiant : listeEtudiants) {
            out.print("<tr>");
            out.print("<td>" + etudiant.getNom() + "</td>");
            out.print("<td>" + etudiant.getCin() + "</td>");
            out.print("<td>" + etudiant.getMoyenne() + "</td>");
            out.print("<td><img src='" + request.getContextPath() + "/images/" + etudiant.getImage() + "' height='40' width='40'/></td>");
            out.print("</tr>");
        }
        out.print("</table>");
        out.print("<br>");
    }

    private void afficherTableauAvecColoration(HttpServletRequest request,PrintWriter out, List<Etudiant> listeEtudiants) {
        out.print("<table border='1'>");
        out.print("<tr><th>Nom</th><th>CIN</th><th>Moyenne</th><th>Image</th></tr>");
        for (Etudiant etudiant : listeEtudiants) {
            out.print("<tr style='" + (etudiant.getMoyenne() < 10 ? "background-color:red;" : "background-color:yellow;") + "'>");
            out.print("<td>" + etudiant.getNom() + "</td>");
            out.print("<td>" + etudiant.getCin() + "</td>");
            out.print("<td>" + etudiant.getMoyenne() + "</td>");
            out.print("<td><img src='" + request.getContextPath() + "/images/" + etudiant.getImage() + "' height='40' width='40'/></td>");
            out.print("</tr>");
        }
        out.print("</table>");
        out.print("<br>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
}
