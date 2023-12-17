package tp8;

public class TestArticle {
    static public void main(String[] args){
        Article article = new Article();
        Article article2 = new Article();

        System.out.println(article.convText());

        System.out.println(article.compare(article2));
    }
}
