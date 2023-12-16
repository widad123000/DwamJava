package identification;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UtilisateurValide")
public class UtilisateurValide extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
        String section = request.getParameter("section");

        String message = "";
        
        if ("IM".equals(section)) {
            message = "Bonjour, vous êtes dans la section IM.";
        } else if ("CM".equals(section)) {
            message = "Bonjour, vous êtes dans la section CM.";
        } else if ("AV".equals(section)) {
            message = "Bonjour, vous êtes dans la section AV.";
        } else {
            message = "Sélection invalide.";
        }

        response.getWriter().println("<html><body><p>" + message + "</p></body></html>");
    }
}
