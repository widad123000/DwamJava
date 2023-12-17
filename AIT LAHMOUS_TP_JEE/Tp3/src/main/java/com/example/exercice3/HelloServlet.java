qpackage com.example.exercice3;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet(name = "helloServlet", urlPatterns ="/name" )
public class HelloServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("creditModel", new creditModel());
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /* lire les donnes de la requet */
        double montant = Double.parseDouble(req.getParameter("montant"));
        double taux = Double.parseDouble(req.getParameter("taux"));
        int duree = Integer.parseInt(req.getParameter("duree"));

        /* initiaiser les donne du modele */
        creditModel mdel = new creditModel();
        mdel.setMontant(montant);
        mdel.setDuree(duree);
        mdel.setTaux(taux);

        /* cree un objet de la couche metier pour appliquer l'operation */
        creditMetierImplementation cmi = new creditMetierImplementation();
        double r = cmi.calculerMesualiteCredit(mdel.getMontant(), mdel.getTaux(), mdel.getDuree());

        /* stocker le resultat dans le modele */
        mdel.setResultat(r);

        /* stocker le modele dans l'objet request */
        req.setAttribute("creditModel", mdel);

        /* Envoyer le resultat vers la vue jsp */
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }

    public void destroy() {
    }

    public static class creditModel  {
        private double taux;
        private int duree;
        private double resultat;
        private double montant;
        // les geters et les seters
        public double getMontant() {
            return montant;
        }
        public void setMontant(double montant) {
            this.montant = montant;
        }
        public double getResultat() {
            return resultat;
        }
        public void setResultat(double resultat) {
            this.resultat = resultat;
        }
        public double getTaux() {
            return taux;
        }
        public void setTaux(double taux) {
            this.taux = taux;
        }
        public int getDuree() {
            return duree;
        }
        public void setDuree(int duree) {
            this.duree = duree;
        }
        public creditModel(double m, double t, int d) {
            this.montant=m;
            this.taux=t;
            this.duree=d;
            this.resultat=0;
        }
        public creditModel() {
        }

    }
}