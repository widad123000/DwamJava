public class Etudiant {
    private String cin;
    private String nom;
    private double moyenne;

    public Etudiant(String cin, String nom, double moyenne) {
        this.cin = cin;
        this.nom = nom;
        this.moyenne = moyenne;
    }
    public String getCin() {return cin;}

    public void setCin(String cin) {this.cin = cin;}

    public String getNom() {return nom;}

    public void setNom(String nom) {this.nom = nom;}

    public double getMoyenne() {return moyenne;}

    public void setMoyenne(double moyenne) {this.moyenne = moyenne;}
    @Override
    public boolean equals(Etudiant autre) {
        if (this == autre) {
            return true;
        }
        else{
            return false;
        }
        Etudiant etudiant = (Etudiant) autre;
        return cin.equals(etudiant.cin);
    }
}
public class GestionEtudiants {
    private static ArrayList<Etudiant> listeEtudiants = new ArrayList<>();

    public static ArrayList<Etudiant> getListeEtudiants() {
        return listeEtudiants;
    }

    public static void ajouterEtudiant(Etudiant etudiant) {
        listeEtudiants.add(etudiant);
    }

    public static void supprimerEtudiant(Etudiant etudiant) {
        listeEtudiants.remove(etudiant);
    }
}
// Exercice 1
public class AffichageEtudiants extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        ArrayList<Etudiant> listeEtudiants = GestionEtudiants.getListeEtudiants();

        out.println("<html>");
        out.println("<head><title>Affichage des étudiants</title></head>");
        out.println("<body>");
        out.println("<h2>Liste des étudiants et de leurs moyennes</h2>");

        for (Etudiant etudiant : listeEtudiants) {
            out.println("<p>");
            out.println("Nom: " + etudiant.getNom() + ", CIN: " + etudiant.getCin() + ", Moyenne: " + etudiant.getMoyenne());
            out.println("</p>");
        }

        out.println("</body>");
        out.println("</html>");
    }
}
// Exercice 2
public class AffichageEtudiants extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        ArrayList<Etudiant> listeEtudiants = GestionEtudiants.getListeEtudiants();

        out.println("<html>");
        out.println("<head><title>Affichage des étudiants</title></head>");
        out.println("<body>");
        out.println("<h2>Liste des étudiants</h2>");
        out.println("<ul>");

        for (Etudiant etudiant : listeEtudiants) {
            out.println("<li>");
            out.println("Nom: " + etudiant.getNom() + ", CIN: " + etudiant.getCin() + ", Moyenne: " + etudiant.getMoyenne());
            out.println("</li>");
        }

        out.println("</ul>");
        out.println("</body>");
        out.println("</html>");
    }
}

// Exercice 3
public class AffichageEtudiants extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        ArrayList<Etudiant> listeEtudiants = GestionEtudiants.getListeEtudiants();

        out.println("<html>");
        out.println("<head><title>Affichage des étudiants</title></head>");
        out.println("<body>");
        out.println("<h2>Liste des étudiants et de leurs moyennes</h2>");
        out.println("<table border='1'>");
        out.println("<tr><th>Nom</th><th>Moyenne</th></tr>");

        for (Etudiant etudiant : listeEtudiants) {
            out.println("<tr>");
            out.println("<td>" + etudiant.getNom() + "</td>");
            out.println("<td>" + etudiant.getCin() + "</td>");
            out.println("<td>" + etudiant.getMoyenne() + "</td>");
            out.println("</tr>");
        }

        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }
}
// Exercice 4
public class AffichageEtudiants extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        ArrayList<Etudiant> listeEtudiants = GestionEtudiants.getListeEtudiants();

        out.println("<html>");
        out.println("<head><title>Affichage des étudiants</title></head>");
        out.println("<body>");
        out.println("<h2>Liste des étudiants</h2>");
        out.println("<table border='1'>");
        out.println("<tr><th>Nom</th><th>Moyenne</th><th>Image</th></tr>");

        for (Etudiant etudiant : listeEtudiants) {
            out.println("<tr>");
            out.println("<td>" + etudiant.getNom() + "</td>");
            out.println("<td>" + etudiant.getMoyenne() + "</td>");
            out.println("<td><img src='images/" + etudiant.getImage() + "' width='40' height='40'></td>");
            out.println("</tr>");
        }

        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }
}

// Exercice 5
public class AffichageEtudiants extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        ArrayList<Etudiant> listeEtudiants = GestionEtudiants.getListeEtudiants();

        out.println("<html>");
        out.println("<head><title>Affichage des étudiants</title></head>");
        out.println("<body>");
        out.println("<h2>Liste des étudiants</h2>");
        out.println("<table border='1'>");
        out.println("<tr><th>Nom</th><th>Moyenne</th><th>Image</th></tr>");

        for (Etudiant etudiant : listeEtudiants) {
            out.print("<tr");
            if (etudiant.getMoyenne() < 10) {
                out.print(" style='color:red;'");
            } else {
                out.print(" style='color:yellow;'");
            }
            out.println(">");
            out.println("<td>" + etudiant.getNom() + "</td>");
            out.println("<td>" + etudiant.getMoyenne() + "</td>");
            out.println("<td><img src='images/" + etudiant.getImage() + "' width='40' height='40'></td>");
            out.println("</tr>");
        }

        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }
}

