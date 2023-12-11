package Etudiat;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AffichageEtudiants")
public class AffichageEtudiants extends HttpServlet {
	private static final String GestionEtudiants = null;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Affichage des étudiants</title></head><body>");

        // Récupérer la liste des étudiants
        ArrayList<Etudiant> listeEtudiants = GestionEtudiants.getListeEtudiants();

        // Afficher les noms et moyennes des étudiants
        for (Etudiant etudiant : listeEtudiants) {
            out.println("<p>Nom: " + etudiant.getNom() + ", Moyenne: " + etudiant.getMoyenne() + "</p>");
        }

        out.println("</body></html>");
    }}