import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletTraitement")
public class ServletTraitement extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String sexe = request.getParameter("sexe");
        String fonction = request.getParameter("fonction");
        String[] loisirs = request.getParameterValues("loisirs");

        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("<html><head><title>Résultat</title></head><body>");
        response.getWriter().println("<p>Bonjour " + (sexe.equals("F") ? "madame" : "monsieur") + " " + prenom + " " + nom + ".</p>");
        response.getWriter().println("<p>Fonction: " + fonction + "</p>");
        response.getWriter().println("<p>Loisirs: " + String.join(", ", loisirs) + "</p>");
        response.getWriter().println("</body></html>");
        out.println("<h2>Liste des Étudiants</h2>");
        for (Etudiant etudiant : listeEtudiants) {
            out.println("<p>" + etudiant.getPrenom() + " " + etudiant.getNom() + " - Moyenne: " + etudiant.getMoyenne() + "</p>");
        }
    }
}
