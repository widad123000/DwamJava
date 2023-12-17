class TestArticle {
    public static void main(String[] args){
        Article a = new Article () ;
        Article a2 = new Article("Pomme",1,11,100);
        Article a3 = new Article(a2);

        System.out.println(a.getNumero());
        System.out.println(a.getDesignation());
        System.out.println(a.getPrixHT());
        System.out.println(a.getQte());

        System.out.println(a2.getNumero());
        System.out.println(a2.getDesignation());
        System.out.println(a2.getPrixHT());
        System.out.println(a2.getQte());

        Vetement v = new Vetement("Chemise", 2, 25, 50, "XL", "Blanc");
        System.out.println(v.PrixTTC());

        ArticleLuxe al = new ArticleLuxe("Montre", 3, 100, 5);
        System.out.println(al.PrixTTC());
    }
};
