public class Permanant extends Professeur{
    
    public Permanant(int IDprofesseur, int NbrDHeur) {
        super(IDprofesseur, NbrDHeur);
      //  this.IDprofesseur = IDprofesseur;
        //TODO Auto-generated constructor stub
    }

    public float salaire( int nbrDHeur)
    {
     float salaire;
      salaire = 200 * nbrDHeur;
      return salaire;
    }
 
}
