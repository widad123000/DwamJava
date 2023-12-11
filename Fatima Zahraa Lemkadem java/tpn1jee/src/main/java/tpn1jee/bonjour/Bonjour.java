package tpn1jee.bonjour;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Bonjour
 */
@WebServlet("/Bonjour")
public class Bonjour extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Bonjour() {
        super();
      
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
        out.println("<head><title>Bonjour Servlet</title></head>");
        out.println("<body>");
        out.println("<h1>Bonjour Servlet</h1>");
        out.println("</body>");
        out.println("</html>");
        
        int  N = 3; 
        int M = 4;
        out.println("<table border='1'>");
        for(int i = 0; i < N ; i++) {
        	out.println("<tr>");
        	for( int j = 0 ; j < M ; j++) {
        		  out.println("<td>Ligne " + (i + 1) + ", Colonne " + (j + 1) + "</td>");
            }
            out.println("</tr>");
        }
        out.println("</table>");
        out.println("<br>");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String dateStr = sdf.format(new Date(0));
        out.println("<h2>Date courante :</h2>");
        out.println("<p>" + dateStr + "</p>");
        
        out.println("<br>");
        
        out.println("<h2>Moyennes :</h2>");
        out.println("<p><a href='Moyennes'>Accéder à la servlet des moyennes</a></p>");
        
        out.println("</body>");
        out.println("</html>");
        	}
        	
        
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
