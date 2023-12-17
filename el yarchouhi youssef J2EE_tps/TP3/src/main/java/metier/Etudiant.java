package metier;

public class Etudiant {
	String cin;
	String name;
	double moyenne;
	
	public Etudiant(String cin, String name, double moyenne) {
		this.cin = cin;
		this.name = name;
		this.moyenne = moyenne;
	}
	
	public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getNom() {
        return name;
    }

    public void setNom(String nom) {
        this.name = nom;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }
	
	@Override
	public boolean equals(Object obj) {
		Etudiant a = (Etudiant) obj;
		return (this.cin == a.cin);
	}
}
