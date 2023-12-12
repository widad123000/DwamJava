public class vacatairePro extends Professeur {
   public vacatairePro(int IDprofesseur, int NbrDHeur) {
        super(IDprofesseur, NbrDHeur);
        //TODO Auto-generated constructor stub
    }

 
   public float salaire( int nbrDHeur)
   {
    float salaire;
     salaire = 300 * nbrDHeur;
     return salaire;
   }
    
}
