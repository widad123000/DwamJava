import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Etudiant;
import metier.GestionEtudiants;

@WebServlet("/AffichageEtudiants")
public class AffichageEtudiants extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        ArrayList<Etudiant> students = GestionEtudiants.getListeEtudiants();

        out.println("<html><head><title>Liste des Etudiants</title></head><body>");
        out.println("<h1>Liste des Etudiants et Leurs Moyennes</h1>");
        out.println("<ul>");
        for (Etudiant student : students) {
            out.println("<li>" + student.getNom() + " - Moyenne: " + student.getMoyenne() + "</li>");
        }
        out.println("</ul>");
        out.println("</body></html>");
    }
}
