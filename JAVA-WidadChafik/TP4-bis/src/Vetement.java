public class Vetement extends Article {
    int taille;
    String couleur;
    Vetement(int numero,String designation,double prixHT,int qte,int taille, String couleur){
        this.designation=designation;
        this.numero=numero;
        this.prixHT=prixHT;
        this.qte=qte;
        this.couleur=couleur;
        this.taille=taille;
    }
    Vetement(){
        super(0,"Spécimen",1,222);
        this.couleur="None";
        this.taille=0;
    }
}
