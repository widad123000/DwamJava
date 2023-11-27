package tp;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Moyennes extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Supposons que vous avez une liste d'étudiants avec leurs moyennes
        String[] noms = {"Étudiant 1", "Étudiant 2", "Étudiant 3"};
        double[] moyennes = {15.5, 18.2, 14.0};

        out.print("<html><body><table border='1'>");
        out.print("<tr><th>Nom</th><th>Moyenne</th></tr>");
        for (int i = 0; i < noms.length; i++) {
            out.print("<tr><td>" + noms[i] + "</td><td>" + moyennes[i] + "</td></tr>");
        }
        out.print("</table></body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
    }
}
