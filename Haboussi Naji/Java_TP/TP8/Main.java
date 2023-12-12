public class Main {
    public static void main(String[] args) {
        // exercice 3 Test des deux classes avec l'interface MonApi :
        MonApi point = new Point(1, 2);
MonApi article = new Article(2, "chemise", 15.5, 45);

point.print();
article.print();

String s = point.convTexte();
String t = article.convTexte();
// exrcice 4 Test avec un tableau d'objets MonApi 
MonApi point = new Point(1, 2);
MonApi article = new Article(2, "chemise", 15.5, 45);

MonApi[] p = { point, article };
for (int i = 0; i < 2; i++)
    p[i].print();
// exrcice 5  Assignation d'un objet Article à une référence MonApi :
MonApi point = new Point(1, 2);
MonApi article = new Article(2, "chemise", 15.5, 45);
point = article; // point prend la référence de l'objet Article

point.print(); // print de Article exécutée bien sûr!
// exercice 6 Tentative de comparaison entre Point et Article :
MonApi point = new Point(1, 2);
MonApi article = new Article(2, "chemise", 15.5, 45);
point.compare(article); // Compilation réussie, mais erreur à l'exécution


    }

    
}
