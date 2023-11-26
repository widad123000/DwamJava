package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Bonjour")
public class Bonjour extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Date date;
	private int n;
	private int m;
	private int nEtudiants;
	private double sumM;
	private double randomN;
	private double moyenneG;

	@Override
	public void init() throws ServletException {
	
	}

    public Bonjour() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter p = response.getWriter();
		// p.print("Bonjour Servlet");
		p.println("<!DOCTYPE html>");
		p.println("<html>");
		p.println("<head><title>Bonjout Servlet</title><meta charset=\"utf-8\"></head>");
		p.println("<body style=\"text-align: center;margin: 0; padding: 0;\"><h1>La date Courant:</h1></body>");
		date = new Date();
		p.print(date.toString());		
		p.print("<br><br>");
		m = 8;
		n = 3;
		p.print("Exemple de tableau");
		p.print("<br>");
		p.print("<table style=\"margin: 0 auto;\" border=\"1\" cellpadding=\"20px\"><tbody>");
		for (int i = 0; i < m; i++) {
			p.print("<tr align=\"center\">");
			for (int j = 0; j < n; j++) {
				p.print("<td> Ligne " + (i+1) + ", Colonne " + (j+1) + "</td>");
			}
			p.print("</tr>");
		}
		p.print("</tbody></table>");
		p.print("<br>");
		p.print("Etudiants et moyennes");
		p.print("<br>");
		p.print("<table cellpadding=\"20\" border=\"1\" style=\"margin: 10px auto;\">");
		p.print("<thead>");
		p.print("<tr><th>Etudiant</th><th>Moyenne</th><tr>");
		p.print("</thead>");
		p.print("<tbody>");
		nEtudiants = 4;
		for (int i = 0; i < nEtudiants; i++) {
			randomN = Math.random() * 20;
			sumM += randomN;
			p.print("<tr><td>nom" + (i+1) + "</td><td>" + randomN + "</td>");
		}
		p.print("</tbody>");
		p.print("</table>");
		moyenneG = sumM / nEtudiants;
		sumM = 0;
		p.print("<h3>Moyenne Générale: " + moyenneG + "</h3>");
		p.println("</html>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
