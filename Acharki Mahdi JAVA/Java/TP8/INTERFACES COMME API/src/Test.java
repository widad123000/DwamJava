public class Test {

    public static void main(String[] args) {


        Article a = new Article();
        System.out.println(a.convTexte());
        a.compare(a);

        MonApi point = (MonApi) new Point(1, 2);
        MonApi article = (MonApi) new Article("chemise", 2, 15.5, 45);
        point.print();
        article.print();
        String s = point.convTexte();
        String t = article.convTexte();

        Point point2 = new Point(1, 2);
        Article article2 = new Article("chemise", 2, 15.5, 45);

        MonApi[] p = {point, article};
        for (int i = 0; i < 2; i++) {
            p[i].print();

        }
        MonApi point = new Point(1,2);
        MonApi article = new Article ("chemise",2,15.5, 45);
        point = article;
        point.print();
        point.compare(article);

    }
}
