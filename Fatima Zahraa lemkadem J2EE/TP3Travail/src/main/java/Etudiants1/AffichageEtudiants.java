package Etudiants1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Etudiants.Etudiant;
import Etudiants.GestionEtudiants;
import Etudiants.ListMain;

/**
 * Servlet implementation class AffichageEtudiants
 */
@WebServlet("/AffichageEtudiants")
public class AffichageEtudiants extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
    public void init() throws ServletException {
		        super.init();
		        ListMain.initialiserListeEtudiants();
		    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Etudiant> listeEtudiants = GestionEtudiants.getListeEtudiants();
	        response.setContentType("text/html");
	        PrintWriter p = response.getWriter();

		p.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ "</head>\r\n"
				+ "<body>"+"<h1>Listes Etudiants</h1>");
		p.println("<table>");
		 p.println("<tr>");
         p.println("<td>Nom</td>");
         p.println("<td>Cin</td>");
         p.println("<td>Moyenne</td>");
         p.println("<td>Supprimer</td>");
         p.println("</tr>");
     
		for (Etudiant etudiant : listeEtudiants) {
           p.println("<tr style='");
           if(etudiant.getMoyenne()>10) {
        	   p.println("background-color:yellow;");
           }
           else {
        	   p.println("background-color:red;");
           }
           p.println("'>");
            p.println("<td>" + etudiant.getNom() + "</td>");
            p.println("<td>" + etudiant.getCin() + "</td>");
            p.println("<td>" + etudiant.getMoyenne() + "</td>");
            p.println("<td><img src='image/'"+etudiant.getImage()+"width='40px'height='40px'></td>");
            p.println("<td><a href='SupprimerEtudiant.java" + etudiant.getCin() + "'>SUPP</a></td>");
            p.println("</tr>");
        }

        p.println("</table>");
        p.println("</body>");
        p.println("</html>");
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
