public class Main {
    public static void main(String[] args)
    {
//      Rectangle ob=new Rectangle();
//        Point p = new Point ();
//        //tostring de Point
//        System.out.println(p.toString());
//      Robot r=new Robot();
//   //appel a toString de robot
//     System.out.println(r.toString());

        /*test Rectangle class
         */
        Point ob1=new Point(7,9);
        Point ob2=new Point(3,5);
        Rectangle ob=new Rectangle(ob1,ob2);

        //System.out.println(ob.afficher());
        ob.afficher();
        System.out.println("en suposant que c'est un carre la surface est a*a (avec a= la distance entre deux point  =:) "+ ob.surface());
       System.out.println("les cordonne est:  "+ob.GetGauche()+"est coin droit vaux :"+ob.GetDroite());
       ob.deplacer(3,6);
       //apres deplacement
        System.out.println("les cordonne est:  "+ob.GetGauche()+"est coin droit vaux :"+ob.GetDroite());
        //Agrandir
        ob.agrandir(5);
        System.out.println("les cordonne de coins gauche est:  "+ob.GetGauche()+"est coin droit vaux :"+ob.GetDroite());



    }
}