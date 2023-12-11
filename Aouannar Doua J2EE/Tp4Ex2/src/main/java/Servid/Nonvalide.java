package Servid;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Nonvalide
 */
@WebServlet("/Nonvalide")
public class Nonvalide extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String logininfo= (String) request.getParameter("logininfo");
		response.setContentType("text/html");
		PrintWriter p = response.getWriter();
		p.println("Echec d'identification; vous avez saisi"+logininfo);
		p.println("<a href='identification.html'> Retour a la page d'identification");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
