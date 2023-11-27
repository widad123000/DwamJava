package tp7ex2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculServlet
 */
@WebServlet("/Calcul")
public class CalculServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            int operande1 = Integer.parseInt(request.getParameter("operande1"));
            int operande2 = Integer.parseInt(request.getParameter("operande2"));
            String operation = request.getParameter("operation");
            int resultat = 0;

            switch (operation) {
                case "+":
                    resultat = operande1 + operande2;
                    break;
                case "-":
                    resultat = operande1 - operande2;
                    break;
                case "*":
                    resultat = operande1 * operande2;
                    break;
                case "/":
                    if (operande2 != 0) {
                        resultat = operande1 / operande2;
                    } else {
                        request.setAttribute("message", "Erreur: Division par zéro.");
                        forwardToSaisie(request, response);
                        return;
                    }
                    break;
            }

            request.setAttribute("resultat", resultat);
            RequestDispatcher rd = request.getRequestDispatcher("resultat.jsp");
            rd.forward(request, response);
        } catch (NumberFormatException e) {
            request.setAttribute("message", "Erreur: Veuillez saisir des nombres valides.");
            forwardToSaisie(request, response);
        }
    }

    private void forwardToSaisie(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("saisie.jsp");
        rd.forward(request, response);
    }
}



