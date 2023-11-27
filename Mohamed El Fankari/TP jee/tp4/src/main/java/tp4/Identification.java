// IdentificationServlet.java

package tp4;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Identification") // Add the servlet mapping
public class Identification extends HttpServlet {
    private static final long serialVersionUID = 1L;

  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        handleIdentification(request, response);
    }

    // Common logic for handling identification
    private void handleIdentification(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        if ("admin".equals(login) && "admin".equals(password)) {
            response.sendRedirect("succes.html");
        } else {
            response.sendRedirect("echec.html");
        }
    }
}
