@WebServlet("/UtilisateurNonValide")
public class UtilisateurNonValide extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Utilisateur Non Valide</title></head><body>");
        out.println("<h1>Echec d'identification</h1>");
        out.println("<p>Vous avez saisi un login ou un mot de passe incorrect.</p>");
        out.println("<a href='identification.html'>Retour à la page d'identification</a>");
        out.println("</body></html>");
    }
}
