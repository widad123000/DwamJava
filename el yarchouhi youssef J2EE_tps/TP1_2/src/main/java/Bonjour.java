

import java.io.IOException;
import java.io.PrintWriter;

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
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Bonjour() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter p = response.getWriter();
		p.println("<html><body>");
		// Generating a table with 5 rows and 3 columms
		p.println("<table border='1'>");
		int numRows = 5;
		int numCols = 3;
		for(int i=0; i<numRows; i++) {
			p.println("<tr>");
			for(int j=0; j<numCols; j++) {
				p.println("<td> Row "+ (i+1)+ ", Colum " + (j+1)+ "</td>");
			}
			p.println("</tr>");
		}
		p.println("</table>");
		
		// displaying the current date 
		java.util.Date currentData = new java.util.Date();
		p.println("<p>Current Date: "+ currentData.toString() + "</p>");
		
		// displaing messages on successive lines
		p.println("<p>First Line of Message</p>");
		p.println("<p>Second Line of Message</p>");
		p.println("</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
