package metier;

import java.util.Objects;

public class Etudiant {

	private String cin;
	private String nom;
	private double moyenne;
	private String img;
	
	public Etudiant(String cin, String nom, double moyenne, String img) {
		this.cin = cin;
		this.nom = nom;
		this.moyenne = moyenne;
		this.img = img;
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
		return moyenne;
	}

	public void setMoyenne(double moyenne) {
		this.moyenne = moyenne;
	}
	
	public String getImg() {
		return this.img;
	}
	
	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Etudiant other = (Etudiant) obj;
		return Objects.equals(cin, other.cin);
	}
	
	
	
}
