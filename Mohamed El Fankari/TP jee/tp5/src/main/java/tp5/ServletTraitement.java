package tp5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletTraitement")
public class ServletTraitement extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String sexe = request.getParameter("sexe");
        String fonction = request.getParameter("fonction");
        String[] loisirs = request.getParameterValues("loisirs");

        out.print("<html><body>");
        out.print("<h2>Information Submitted:</h2>");
        out.print("<p>Bonjour " + (sexe.equals("F") ? "madame" : "monsieur") + " " + prenom + " " + nom + "</p>");
        
        if (fonction != null) {
            out.print("<p>Fonction: " + fonction + "</p>");
        }

        if (loisirs != null) {
            out.print("<p>Loisirs: ");
            for (String loisir : loisirs) {
                out.print(loisir + " ");
            }
            out.print("</p>");
        }

        out.print("</body></html>");
    }
}



