package ma.est.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ma.est.entities.Etudiant;
import ma.est.services.EtudiantService;
import ma.est.services.IEtudiantService;

@WebServlet(name = "cs", urlPatterns = {"/displayEtudiant", "/addEtudiant"})
public class ServletEtudiant extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	private IEtudiantService serviceEtudiant;
	public void init() 
	{
		serviceEtudiant=new EtudiantService();
	}
    public ServletEtudiant()
    {
    	    	
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		request.getRequestDispatcher("displayEtudiant.jsp").forward(request, response);
	}

}
