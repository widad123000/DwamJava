package ServCal;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calcule
 */
@WebServlet("/Calcule")
public class Calcule extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String op1str = request.getParameter("op1") ;
		String op2str = request.getParameter("op2") ;
		 String section = request.getParameter("section");
		 
		 if (op1str.isEmpty() || op2str.isEmpty()) {
	         request.setAttribute("message", "Les opérandes ne peuvent pas être vides.");
	         request.getRequestDispatcher("saisie.jsp").forward(request, response);
	         return;
	     }
		 
		 int op1 = Integer.parseInt(request.getParameter("op1")) ;
		 int op2 = Integer.parseInt(request.getParameter("op2")) ;
		 int resultat = 0;
	     switch (section) {
	         case "addition":
	             resultat =op1 + op2;
	             break;
	         case "soustraction":
	             resultat = op1 - op2;
	             break;
	         case "multiplication":
	             resultat = op1 * op2;
	             break;
	         case "division":
	             if (op2 != 0) {
	                 resultat = op1 / op2;
	             } else {
	            	 request.setAttribute("message", "Division par zéro impossible.");
	            	 request.getRequestDispatcher("resultat.jsp").forward(request, response);
	                 return;
	             }
	             break;
	         default:
	             break;
	     }
	     
	     request.setAttribute("resultat", resultat);

		
		 request.getRequestDispatcher("resultat.jsp").forward(request, response);
		 
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
	}

}
