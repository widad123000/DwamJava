package web2;

public class Etudiant {
	private String cin;
    private String nom;
    private double moyene;
    
    public Etudiant(String cin, String nom, double moyenne) {
        this.cin = cin;
        this.nom = nom;
        this.moyene = moyenne;
    }
    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getMoyene() {
        return moyene;
    }

    public void setMoyenne(double moyenne) {
        this.moyene = moyenne;
    }
    public boolean equals(Etudiant a) {
        if (this == a)  
        	return true;
        else 
        	return false;
        
       
        
    }

}
