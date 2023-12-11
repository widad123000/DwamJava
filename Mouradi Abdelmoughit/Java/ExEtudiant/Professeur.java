import java.util.ArrayList;

public class Professeur {
   private int IDprofesseur;
   private int NbrDHeur;
   ArrayList<Matier> matier  = new ArrayList<Matier>();
    public Professeur(int IDprofesseur, int NbrDHeur) {
        this.IDprofesseur = IDprofesseur;
        this.NbrDHeur = NbrDHeur;
    }
    public void setIDprofesseur(int iDprofesseur) {
        IDprofesseur = iDprofesseur;
    }
    public void setNbrDHeur(int nbrDHeur) {
        NbrDHeur = nbrDHeur;
    }
    public int getIDprofesseur() {
        return IDprofesseur;
    }
    public int getNbrDHeur() {
        return NbrDHeur;
    }
   public void Profmatier(Matier matr,int IDprof) {  
   
    if (IDprofesseur == IDprof) {
      matier.set(IDprof, matr);

   }   
   else{
    System.out.println("ID not coreect");
   }
   }

}
