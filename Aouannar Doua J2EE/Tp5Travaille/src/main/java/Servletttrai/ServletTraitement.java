package Servletttrai;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletTraitement
 */
@WebServlet("/ServletTraitement")
public class ServletTraitement extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String sx = request.getParameter("sexe");
		String fnct = request.getParameter("fonction");
		String [] loisirs = request.getParameterValues("loisirs");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		
		out.println("Bonjour" +(sx.equals("femme")? "Madame" : "Monsieur")+ prenom + " " + nom  );
		
		out.println("<h2>Fonction: " + fnct + "</h2>");
		
		if(loisirs!= null && loisirs.length>0) {
			out.println("<h3>loisirs:</h3>");
			for (String loisir : loisirs) {
               out.println("" + loisir + "<br>");
            }
		}
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
