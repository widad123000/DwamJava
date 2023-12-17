package calcul;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Calcul")
public class Calcul extends HttpServlet {
    

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
           
            int operande1 = Integer.parseInt(request.getParameter("operande1"));
            int operande2 = Integer.parseInt(request.getParameter("operande2"));
            String operation = request.getParameter("operation");

            
            int resultat = 0;
            switch (operation) {
                case "addition":
                    resultat = operande1 + operande2;
                    break;
                case "soustraction":
                    resultat = operande1 - operande2;
                    break;
                case "multiplication":
                    resultat = operande1 * operande2;
                    break;
                case "division":
                    
                    if (operande2 != 0) {
                        resultat = operande1 / operande2;
                    } else {
                      
                        request.setAttribute("message", "Erreur : Division par zéro");
                        request.getRequestDispatcher("saisie.jsp").forward(request, response);
                        return;
                    }
                    break;
                default:
                    request.setAttribute("message", "Erreur : Opération non valide");
                    request.getRequestDispatcher("saisie.jsp").forward(request, response);
                    return;
            }

            request.setAttribute("resultat", resultat);
            request.getRequestDispatcher("resultat.jsp").forward(request, response);

        } catch (NumberFormatException e) {
   
            request.setAttribute("message", "Erreur : Format incorrect pour les opérandes");
            request.getRequestDispatcher("saisie.jsp").forward(request, response);
        }
    }
}
