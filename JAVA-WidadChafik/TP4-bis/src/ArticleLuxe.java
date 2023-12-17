public class ArticleLuxe extends Article{

    ArticleLuxe(){
        super(0,"Spécimen",1,222);

    }
    ArticleLuxe(int numero,String designation,double prixHT,int qte){
        this.designation=designation;
        this.numero=numero;
        this.prixHT=prixHT;
        this.qte=qte;
    }


    public double prixTTC() {
        return prixHT*1.25;
    }
}
