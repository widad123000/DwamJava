class Vetement extends Article {
    private String taille;
    private String couleur;

    public Vetement() {
        super();
        this.taille = "M";
        this.couleur = "Noir";
    }

    public Vetement(String designation, int numero, double prixHT, int qte, String taille, String couleur) {
        super(designation, numero, prixHT, qte);
        this.taille = taille;
        this.couleur = couleur;
    }


    @Override
    public double PrixTTC() {
        return getPrixHT() * 1.1;
    }
}


