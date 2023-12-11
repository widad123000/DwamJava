package Servletid;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Identification")
public class Identification extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String L = request.getParameter("log");
		String P= request.getParameter("pssd");
		if(L.equals("admis") && P.equals("admis")) {
			request.setAttribute("utilisateurConnecte", L);

			request.getRequestDispatcher("accueil.jsp ").forward(request, response);
		}
		else {
			request.getRequestDispatcher("echec.html").forward(request, response);
		}


		
		
		
		doGet(request, response);
	}

}
