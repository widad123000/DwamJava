package bonjour;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Bonjour")
public class Bonjour extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		 out.println("<html><head><title>Bonjour Servlet</title></head><body>");

	        int lignes = 3;
	        int colonnes = 2;
	        Date date =new Date();

	        
	        SimpleDateFormat sdf = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss");
	        String dateStr = sdf.format(date);
	        out.println("<p>Date courante : " + dateStr + "</p>");
	        
	        out.println("<br>");
	        
	        out.println("<table border='1'>");
	        for (int i = 0; i < lignes; i++) {
	            out.println("<tr>");
	            for (int j = 0; j < colonnes; j++) {
	                out.println("<td>Ligne " + (i + 1) + ", Colonne " + (j + 1) + "</td>");
	            }
	            out.println("</tr>");
	        }
	        out.println("</table>");

	        out.println("</body></html>");
	    }
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
