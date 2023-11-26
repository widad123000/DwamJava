

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import metier.Etudiant;
import metier.GestionEtudiants;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="cs", urlPatterns ={"/AffichageEtudiants", "*.do"})
public class AffichageEtudiants extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<Etudiant> lstEtudiants;
       
    public AffichageEtudiants() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter p = response.getWriter();
		lstEtudiants = new ArrayList<Etudiant>();
		lstEtudiants.add(new Etudiant("AAA", "Mark", 12.5, "cooper1.jpg"));
		lstEtudiants.add(new Etudiant("BBB", "Alex", 17.2, "cooper2.jpg"));
		lstEtudiants.add(new Etudiant("CCC", "John", 5.7, "cooper1.jpg"));
		lstEtudiants.add(new Etudiant("DDD", "Ahmed", 13.5, "cooper1.jpg"));
		lstEtudiants.add(new Etudiant("EEE", "Albert", 6.2, "cooper2.jpg"));
		
		GestionEtudiants gesEtudiants = new GestionEtudiants();
		gesEtudiants.setListeEtudiants(lstEtudiants);
		
		p.print("<!DOCTYPE html>");
		p.print("<html>");
		p.print("<head><title>Gestion des Etudians</title><meta charset=\"utf-8\"></head>");
		p.print("<body style=\"text-align: center; margin: 0;\">");
		p.print("<h1>Liste des Etudiants</h1>");
		/*
		 * for (Etudiant e : GestionEtudiants.getListeEtudiants()) { p.print(e.getNom()
		 * + "&nbsp" + e.getCin() + "&nbsp" + e.getMoyenne()); p.print("<br>"); }
		 */
		/*
		 * p.print("<ul>"); for (Etudiant e : GestionEtudiants.getListeEtudiants()) {
		 * p.print("<li>" + e.getNom() + " " + e.getCin() + " " + e.getMoyenne() +
		 * "</li>"); }
		p.print("</ul>");
		 */
		p.print("<table width=\"60%\" align=\"center\" border=\"1\" cellpadding=\"15\">");
		p.print("<thead>");
		p.print("<tr><th>Nom</th><th>Cin</th><th>Moyenne</th><th>Photo</th></tr>");
		p.print("</thead>");
		p.print("<tbody>");
		for (Etudiant e : GestionEtudiants.getListeEtudiants()) {
			if (e.getMoyenne() >= 10) {				
				p.print("<tr bgcolor=\"yellow\">");
			} else {
				p.print("<tr bgcolor=\"red\">");
			}
			p.print("<td>" + e.getNom() + "</td><td>" + e.getCin()+ "</td><td>"+e.getMoyenne()+"</td>");
			if (e.getImg().equals("cooper1.jpg")) {
				p.print("<td><img width=\"40px\" height=\"40px\" src=\"images/cooper1.jpg\"></td>");
			} else {
				p.print("<td><img width=\"40px\" height=\"40px\" src=\"images/cooper2.jpg\"></td>");
			}
			p.print("</tr>");
		}
		p.print("</tbody>");
		p.print("</table>");
		p.print("</body>");
		p.print("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
