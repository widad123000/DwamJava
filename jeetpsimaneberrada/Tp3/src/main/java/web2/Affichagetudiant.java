package web2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Affichagetudiant extends HttpServlet  {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws
			ServletException, IOException {
				response.setContentType("text/html");

			PrintWriter out = response.getWriter();
			
			
			 Gestionetd.ajouterEtudiant(new Etudiant("123", "imane", 18));
		        Gestionetd.ajouterEtudiant(new Etudiant("456", "ahmed", 20));

		        List<Etudiant> listeEtudiants = Gestionetd.getListeEtudiants();

		        out.println("<html><head><title>Affichage des étudiants</title></head><body>");
		        out.println("<h2>Liste des étudiants</h2>");

		        for (Etudiant etudiant : listeEtudiants) {
		            out.println("<p>CIN: " + etudiant.getCin() + " - Nom: " + etudiant.getNom() + " - Moyenne: "
		                    + etudiant.getMoyene() + "</p>");
		        }

		       

		       //
		        out.println("<h2>Liste des étudiants avec kiste en puces</h2>");
		        out.print("<ul type='disc'>"); 

		        for (Etudiant etudiant : listeEtudiants) {
		            out.println("<li>CIN: " + etudiant.getCin() + " Nom: " + etudiant.getNom() + " Moyenne: "
		                    + etudiant.getMoyene() + "</li>");
		        }

		        out.print("</ul>");

		        
		        
		        
		        out.println("<h2>Liste des étudiants avec tableau</h2>");
		       
		     out.print("<table border='2'>");
		        for(Etudiant etudiant:listeEtudiants) {
		        	 
		        	 out.print("<tr>");
		        	 out.print("<td>");
		        	 out.println("CIN: " +etudiant.getCin());out.print("</td>");
		        	 out.print("<td>");
		        	 out.println("  Nom: " + etudiant.getNom());out.print("</td>");
		        	 out.print("<td>");
		        	 out.println(" Moyenne: "+ etudiant.getMoyene());out.print("</td>");
		        	 out.print("</tr>");}

		        	 out.print("</table >");
		        	 
		        	 out.println("</body></html>");
		        	
		        
		        
		        
			}
	
	
	
	

}
