package ma.est.services;

import java.util.List;

import ma.est.entities.Etudiant;

public interface IEtudiantService {
	public void addEtudiant(Etudiant e);
	public Boolean equals(Etudiant e);
	public List<Etudiant> getAllAccouts();
}
