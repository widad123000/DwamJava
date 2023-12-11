package Servlet2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Bonjour2
 */
@WebServlet("/Bonjour2")
public class Bonjour2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        out.println("<!DOCTYPE html>");
	        out.println("<html>");
	        out.println("<head>");
	        out.println("<meta charset=\"ISO-8859-1\">");
	        out.println("<title>Servlet Bonjour</title>");
	        out.println("</head>");
	        out.println("<body>");

	        out.println("Bonjour!<br>");
	        out.println("La date est :<br> " + new java.util.Date() + "<br>");

	        int n = 9;
	        int m = 3;
	        out.println("<table border=\"1\">");
	        for (int i = 0; i < n; i++) {
	            out.println("<tr>");
	            for (int j = 0; j < m; j++) {
	                out.println("<td>Ligne " + (i) + ", Colonne " + (j) + "</td>");
	            }
	            out.println("</tr>");
	        }
	        out.println("</table><br>");
	        
	        out.println("Etudiants et Moyennes");

	        out.println("<table border=\"1\">");
	        out.println("<tr><td>Nom</td><td>Moyenne</td></tr>");
	        int nombreEtudiants = 4;
	        for (int i = 0; i < nombreEtudiants; i++) {
	            out.println("<tr>");
	            out.println("<td>Nom " + (i+1) + "</td>");
	            double moyenne = Math.random() * 20;
	            out.println("<td>" + moyenne + "</td>");
	            out.println("</tr>");
	        }
	        out.println("</table>");

	        out.println("</body>");
	        out.println("</html>");
	    }
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
