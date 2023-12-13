package ma.est.services;

import java.util.ArrayList;
import java.util.List;

import ma.est.entities.Etudiant;

public class EtudiantService implements IEtudiantService
{
	private List<Etudiant> listEtudiants = new ArrayList<Etudiant>();
	public EtudiantService() {
	}
	public void addEtudiant(Etudiant e)
	{
		listEtudiants.add(e);
	}
	public Boolean equals(Etudiant e)
	{
		for(Etudiant etudiant :listEtudiants)
		{
			if(etudiant.getCin()==e.getCin())
			{
				return true;
			}
		}
		return false;
	}
	@Override
	public List<Etudiant> getAllAccouts() 
	{
		return listEtudiants;
	}

}
