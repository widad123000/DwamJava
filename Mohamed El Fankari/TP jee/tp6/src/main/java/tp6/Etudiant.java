package tp6;

public class Etudiant {
    private String nom;
    private String prenom;
    private String image;

    public Etudiant(String nom, String prenom, String image) {
        this.nom = nom;
        this.prenom = prenom;
        this.image = image;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getImage() {
        return image;
    }
}
