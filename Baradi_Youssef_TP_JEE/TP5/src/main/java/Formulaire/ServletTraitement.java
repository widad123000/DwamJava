package Formulaire;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Identification")
public class ServletTraitement extends HttpServlet {
	
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		 String Prenom   = request.getParameter("prenom");
	     String nom = request.getParameter("nom");
	     String sexe   = request.getParameter("sexe");
	     String fonction  = request.getParameter("fonction");
	     String loisirs  = request.getParameter("loisirs");
	     String msg      = request.getParameter("msg");
	     
	     
	     String message ;
	     
          if("H".equals(sexe)) {
        	  
        	  message = "Bonjour " + " monsieur " + fonction + " : " + Prenom + " "+ nom + " " + msg; 
        	  
          }else {
        	  message = "Bonjour " + " madame " + fonction+ " : " +Prenom + " "+ nom + " " + msg ; 
          }
          
          if(sexe.isEmpty() || loisirs.isEmpty()) {
        	  getServletContext().getRequestDispatcher("/formulaire.html").forward(request, response);
          }
        	  
        	  
	        response.getWriter().println("<html><body><p>" + message + "</p>");
	        response.getWriter().println("</body></html>");
	       
	}

}