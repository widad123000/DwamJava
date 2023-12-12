class ArticleLuxe extends Article {
    public ArticleLuxe() {
        super();
    }

    public ArticleLuxe(String designation, int numero, double prixHT, int qte) {
        super(designation, numero, prixHT, qte);
    }

    @Override
    public double PrixTTC() {
        return getPrixHT() * 1.25;
    }
}
