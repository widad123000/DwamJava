package Etudiants;

public class Etudiant {
	private String image;
	private String cin ; 
	private String nom ; 
	private double Moyenne;
	
	public Etudiant(String cin , String nom , double Moyenne , String image ) {
		this.cin=cin;
		this.nom=nom;
		this.Moyenne=Moyenne;
		this.image=image; 
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
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

	public double getMoyenne() {
		return Moyenne;
	}

	public void setMoyenne(double moyenne) {
		Moyenne = moyenne;
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj==null || getClass() != obj.getClass()) {
			return false;
		}
		Etudiant etudiant = (Etudiant) obj;
        return cin.equals(etudiant.cin);
	}

}
