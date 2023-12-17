package tp4_bis;

public class Vetement extends Article {
    private String taille;
    private String couleurs;

    // construcotr
    public Vetement(){
        super();
    }
    public Vetement(int n, String m, double p, int q, String taille, String color){
        super(n,m,p,q);
        this.taille = taille;
        this.couleurs = color;
    }
}
