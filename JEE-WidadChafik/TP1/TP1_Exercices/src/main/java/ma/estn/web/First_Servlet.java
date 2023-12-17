package ma.estn.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/First_Servlet")
public class First_Servlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
    public First_Servlet() 
    {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");		
		PrintWriter p = response.getWriter();
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
		int n=5;
		int m=5;
		for(int i=0;i<n;i++)
		{			
			p.println("<tr>");
			for(int j=0;j<m;j++)
			{
				p.println("<td>ligne "+i+" colonne "+j+"</td>");
			}
			p.println("</tr>");
		}
		p.println("</table>");
		p.println("</body>");
		p.println("</html>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}