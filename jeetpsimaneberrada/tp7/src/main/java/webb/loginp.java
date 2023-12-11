package webb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class loginp
 */
@WebServlet("/loginp")

public class loginp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public loginp() {
        super();
            }

	
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String login = verifierInformationsIdentifiant(request.getParameter("username"), request.getParameter("password"));

        
           
            HttpSession session = request.getSession();
            session.setAttribute("utilConnecte", login);

           
            response.sendRedirect("accueil.jsp");
       
    }

    private String verifierInformationsIdentifiant(String username, String password) {
       
        if ("utilisateur123".equals(username) && "motdepasse123".equals(password)) {
            return "utilisateur123";
        } else {
            return null;
        }
    }
}
