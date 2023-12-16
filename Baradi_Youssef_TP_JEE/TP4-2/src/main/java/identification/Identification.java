package identification;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Identification")
public class Identification extends HttpServlet {
	
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		 String login    = request.getParameter("login");
	     String password = request.getParameter("password");
	
	     
	     if ("admin".equals(login) && "admin".equals(password)) {
			
	    	 getServletContext().getRequestDispatcher("UtilisateurValide.java").forward(request, response);
			
		}else {
			getServletContext().getRequestDispatcher("UtilisateurNonValide").forward(request, response);
		}
	     
		
	}

}
