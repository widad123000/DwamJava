@WebServlet("/Identification")
public class Identification extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        if ("admin".equals(login) && "admin".equals(password)) {
            // Redirection en cas de succès
            RequestDispatcher dispatcher = request.getRequestDispatcher("succes.html");
            dispatcher.forward(request, response);
        } else {
            // Redirection en cas d'échec
            RequestDispatcher dispatcher = request.getRequestDispatcher("echec.html");
            dispatcher.forward(request, response);
        }
    }
}
