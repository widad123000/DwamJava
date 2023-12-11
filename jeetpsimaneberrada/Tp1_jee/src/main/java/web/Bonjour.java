package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Bonjour extends HttpServlet {
@Override
protected void doGet(HttpServletRequest request,
HttpServletResponse response) throws
ServletException, IOException {
	response.setContentType("text/html");

PrintWriter out = response.getWriter();
out.print("Bonjour Servlet");

out.println("<html><body>");out.println("<p>Date courante : " + new java.util.Date() + "</p>");
out.println("<center>exemple de tableau</center>");

out.println("<center><table border='1'>");

   int N = 5; 
    int M = 3; 

for (int i = 0; i < N; i++) {
    out.println("<tr>");
    for (int j = 0; j < M; j++) {
        out.println("<td>ligne " + i + "Colone" + j + "</td>");
    }
    out.println("</tr>");
}

out.println("</table></center>");
out.println("<center>etudients et moyens</center>");
int a = 4;
int b = 2;

out.println("<center><table border='1'>");
out.println("<tr>");
out.println("<td> Nom </td>");
out.println("<td> Moyenne </td>");
out.println("</tr>");

for (int i = 0; i < a; i++) {
    out.println("<tr>");
    out.println("<td> Nom " + i + "</td>");
    out.println("<td>" + Math.random() + "</td>");
    out.println("</tr>");
}

out.println("</table></center>");

out.println("</body></html>");



}
}

