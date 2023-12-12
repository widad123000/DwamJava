package identificarion.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Identification")
public class Identification extends HttpServlet {
	
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		 String login = request.getParameter("login");
	     String password = request.getParameter("password");
	
	     if ("admin".equals(login) && "admin".equals(password)) {
			
	    	 getServletContext().getRequestDispatcher("succes.html").forward(request, response);
			
		}else {
			getServletContext().getRequestDispatcher("echec.html").forward(request, response);
		}
	     
		
	}

}
