@WebServlet("/UtilisateurValide")
public class UtilisateurValide extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String role = request.getParameter("role");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Utilisateur Valide</title></head><body>");
        out.println("<h1>Bienvenue dans la section " + role + "</h1>");
        out.println("</body></html>");
    }
}
