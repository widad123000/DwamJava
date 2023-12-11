import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UtilisateurValide")
public class UtilisateurValide extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Récupérer la valeur du paramètre "choix"
        String choix = request.getParameter("choix");

        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("<html><head><title>Utilisateur Valide</title></head><body>");
        response.getWriter().println("<h1>Utilisateur Valide</h1>");
        response.getWriter().println("<p>Choix: " + choix + "</p>");
        response.getWriter().println("<html><head><title>Utilisateur Non Valide</title></head><body>");
        response.getWriter().println("<h1>Utilisateur Non Valide</h1>");
        response.getWriter().println("</body></html>");
      
      
    }
}
