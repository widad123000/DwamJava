package ma.est.entities;

public class Etudiant {
	private String cin;
	private String nom;
	private Double moyenne;
	public Etudiant(String cin, String nom, Double moyenne) 
	{
		this.cin = cin;
		this.nom = nom;
		this.moyenne = moyenne;
	}
	public Etudiant() 
	{
		
	}
	public String getCin() 
	{
		return cin;
	}
	public void setCin(String cin) 
	{
		this.cin = cin;
	}
	public String getNom() 
	{
		return nom;
	}
	public void setNom(String nom) 
	{
		this.nom = nom;
	}
	public Double getMoyenne() 
	{
		return moyenne;
	}
	public void setMoyenne(Double moyenne) 
	{
		this.moyenne = moyenne;
	}
	
		
	
	
	

}
