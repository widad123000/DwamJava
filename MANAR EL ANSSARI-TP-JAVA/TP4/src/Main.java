public class Main {
    public static void main(String[] args) {
       /*Point p=new Point(2,2);
        Point p1=new Point(3,4);
        Point p2=new Point(4,5);
        Point p3=new Point(7,6);
       Rectangle r=new Rectangle(p,p1);
         r.afficher();
         r.setHg(p2);
         r.setBd(p3);
         r.afficher();
         Robot R=new Robot(3,3,1);
         R.avancer();
        System.out.println(R);*/
        Robot r=new Robot(3,3,1);
        Point p = new Point (6,7);
        System.out.println(p.toString());
        p = r;
        System.out.println(p.toString());
   


    }
}