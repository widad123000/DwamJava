@WebServlet("/Identification")
public class Identification extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String choix = request.getParameter("choix");

        if ("admin".equals(login) && "admin".equals(password)) {
            // Redirection en fonction du choix
            if ("IM".equals(choix)) {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/UtilisateurValide?role=IM");
                dispatcher.forward(request, response);
            } else if ("CM".equals(choix)) {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/UtilisateurValide?role=CM");
                dispatcher.forward(request, response);
            } else if ("AV".equals(choix)) {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/UtilisateurValide?role=AV");
                dispatcher.forward(request, response);
            }
        } else {
            // Redirection en cas d'échec
            RequestDispatcher dispatcher = request.getRequestDispatcher("echec.html");
            dispatcher.forward(request, response);
        }
    }
}
