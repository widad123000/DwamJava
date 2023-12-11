package Etudiants1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Etudiants.Etudiant;
import Etudiants.GestionEtudiants;

/**
 * Servlet implementation class InsertionEtudiant
 */
@WebServlet("/InsertionEtudiant")
public class InsertionEtudiant extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nom = request.getParameter("nom");
		String cin= request.getParameter("cin");
		double Moyenne = Double.parseDouble(request.getParameter("moyenne")) ;
		String image = request.getParameter("image");
		
		Etudiant etudiant = new Etudiant(nom,cin,Moyenne,image);
		
		GestionEtudiants GE = new GestionEtudiants();
		
		response.sendRedirect("Etudiants1.AffichageEtudiants");


	}

}
