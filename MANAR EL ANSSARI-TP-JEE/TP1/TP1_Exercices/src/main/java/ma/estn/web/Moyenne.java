package ma.estn.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Moyenne
 */
@WebServlet("/Moyenne")
public class Moyenne extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		request.getRequestDispatcher("/First_Servlet").include(request, response);
		PrintWriter p = response.getWriter();
		p.println("");
		p.println("<html>");
		p.println("<head>");
		p.println("<style>");
		p.println("td{padding-right:50px;}");
		p.println("</style>");
		p.println("</head>");
		p.println("<body>");						
		p.println("Bonjour");
        Calendar calendar = Calendar.getInstance();
        p.println("Date d'aujourd'hui : " + calendar.getTime());
		p.println("<table border=\"2\">");
		int n=10;
		for(int i=0;i<n;i++)
		{			
			p.println("<tr>");
			for(int j=0;j<2;j++)
			{
				if (j==0)
				{
					p.println("<td>nom "+(i+1)+" </td>");
				}
				else
				{
					Random random = new Random();
					double moy = 1 + (20 - 1) * random.nextDouble();
					p.println("<td>"+moy+"</td>");
				}
			}
			p.println("</tr>");
		}
		p.println("</table>");
		p.println("</body>");
		p.println("</html>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
