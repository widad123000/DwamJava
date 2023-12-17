

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Moyennes
 */
@WebServlet("/Moyennes")
public class Moyennes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Moyennes() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter p = response.getWriter();
		
		p.println("<html><body>");
		
		// display names and random averages for students
		p.println("<h2>Student Averages</h2>");
		p.println("<table border='1'>");
		int numStudents = 5;
		int numCols = 2;
		
		for(int i=0; i<numStudents; i++) {
			p.println("<tr>");
			p.println("<td> nom " + (i+1)+"</td>");
			double randomAverage = Math.random() * 100;
			p.println("<td>"+ randomAverage +"</td>");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
