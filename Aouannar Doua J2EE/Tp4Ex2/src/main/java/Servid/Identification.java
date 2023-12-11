package Servid;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Identification
 */
@WebServlet("/Identification")
public class Identification extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String L = request.getParameter("log");
		String P = request.getParameter("pssd");
		if(L.equals("admis")&& P.equals("admis")) {
			String section = request.getParameter("Section");
			if(section != null && !section.isEmpty()) {
			request.getRequestDispatcher("Valide.java").forward(request, response);
		}
		else {
			response.sendRedirect("Nonvalide.java");
		}
		}
		else {
			String logininfo="login"+L+"password"+P;
			request.setAttribute("logininfo", logininfo);
			response.sendRedirect("Nonvalide.java");
		}
		
	}

}
