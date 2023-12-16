package tp3;

public class TestPoint {

    public static void main(String[] args) {

        Point p1 = new Point(1,2);

        Point p2 = new Point(2,3);

        System.out.println("\nx : " + p1.getX());
        System.out.println("y : " + p1.getY());

        //la distance entre p1 & p2 en utilisant la méthode distance de la classe Point

        double dis1 = p1.distance(p2);
        System.out.println("la distance entre les differents points : " +dis1);

        //la distance entre p1 & p2 en utilisant la méthode statique staticDistance

        double res;
        res = Point.distance(p1,p2);

        System.out.println("la distance entre les differents points : " +res);


        // p1 : (1,2)

        Point q = new Point(7,2);
        
        System.out.println("\nTest de la fonction equals:");
        if (p1.equals(q)){
            System.out.println("p1 == q");
        }else {
            System.out.println("p1 != q");
        }

        /*p.deplacer(10,20);
        System.out.println("\nx : " + p.getX());
        System.out.println("y : " + p.getY());

        p.reset();
        System.out.println("\nx : " + p.getX());
        System.out.println("y : " + p.getY());*/

    }
}











/*La différence entre le cas 2 et le cas 3 est que la fonction distance() est déclarée static
dans le cas 3. Cela signifie que la fonction ne dépend pas d'un objet Point particulier.
Elle peut être appelée sans créer d'objet Point.*/