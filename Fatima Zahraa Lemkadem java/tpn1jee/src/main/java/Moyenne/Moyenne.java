package Moyenne;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Moyenne")
public class Moyenne extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Moyenne() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
        out.println("<head><title>Moyennes Servlet</title></head>");
        out.println("<body>");
        
        int N = 3 ;
        out.println("<h2>Moyennes des étudiants :</h2>");
        out.println("<table border='1'>");
        out.println("<tr><th>Nom</th><th>Moyenne</th></tr>");
        
        for ( int i = 0; i<N ;i++) {
        	String nom = "Etudiant" +(i+1);
        	double moyenne = Math.random()*100;
        	  out.println("<tr><td>" + nom + "</td><td>" + moyenne + "</td></tr>");
        	
        }
        out.println("</table>");

        out.println("</body>");
        out.println("</html>");

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
