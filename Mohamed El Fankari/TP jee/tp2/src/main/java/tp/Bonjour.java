package tp;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Bonjour extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int N = 5; // Nombre de lignes
        int M = 3; // Nombre de colonnes

        out.print("<html><body><table border='1'>");
        for (int i = 1; i <= N; i++) {
            out.print("<tr>");
            for (int j = 1; j <= M; j++) {
                out.print("<td>Ligne " + i + ", Colonne " + j + "</td>");
            }
            out.print("</tr>");
        }
        out.print("</table><br>");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String dateCourante = sdf.format(new Date());

        out.print("<p>Date courante : " + dateCourante + "</p><br>");
        out.print("<p>premiere ligne</p>");
        out.print("<p>Deuxieme ligne</p>");
        out.print("</body></html>");
        
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    }
}
