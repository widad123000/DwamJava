package identification;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UtilisateurNonValide")
public class UtilisateurNonValide extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        
        String message = "Echec d'identification; vous avez saisi le login " + login + " et le mot de passe " + password ;

        response.getWriter().println("<html><body><p>" + message + "</p>");
        response.getWriter().println("<p><a href=\"identification.html\">Retour à la page d'identification</a></p></body></html>");
    }
}
