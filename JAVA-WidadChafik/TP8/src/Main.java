public class Main {
    public static void main(String[] args) {

        Article a = new Article(1,"pomme",1.2,222);
        System.out.println(a.convTexte());
        Object o=new Article(1,"pomme",1.2,222);
        System.out.println(a.compare(o));
        MonApi point = new Point(1,2);
        MonApi article = new Article(2,"chemise",15.5, 45);
        point.print();
        /*article.print();
        String s = point.convTexte();
        String t = article.convTexte();
        System.out.println(s);
        System.out.println(t);

        Point point1 = new Point(1,2);
        Article article1 = new Article(2,"chemise",15.5, 45);
        MonApi [] p = {point1, article1};
        for (int i=0; i<2; i++)
            p[i].print();*/

        MonApi point2 = new Point(1,2);

        Point p=new Point(1,2);
        MonApi article2 = new Article (2,"chemise",15.5, 45);
        point2 = article2;
        point2.print();
        

    }
}