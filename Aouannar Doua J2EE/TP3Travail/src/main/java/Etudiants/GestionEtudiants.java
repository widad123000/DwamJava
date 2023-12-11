package Etudiants;

import java.util.ArrayList;
import java.util.List;

public class GestionEtudiants {
	 private static List<Etudiant> listeEtudiants = new ArrayList<>();

	    public static List<Etudiant> getListeEtudiants() {
	        return listeEtudiants;
	    }
	    
	    public void Supprimer ( String cin) {
	    	Etudiant SupEt = null;
	    	for(Etudiant ET : listeEtudiants) {
	    		if(ET.getCin().equals(cin)) {
	    			SupEt = ET;
	    			break;
	    		}
	    	if(SupEt != null) {
	    		listeEtudiants.remove(SupEt);
	    		System.out.println("Etudiant supprimer avec succes");
	    	}
	    	else {
	    		System.out.println("Etudiant non trouve");
	    	}
	    	}
	    }

	 
	 

}
