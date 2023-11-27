package testt;

public class mtest {
	public static void main(String args[]) {
  

        Point p = new Point(1, 2);
        Point q = new Point(1, 2);
        System.out.println(p.equals(q));  

        Point r = new Point(1, 2);
        Point s = r;
        System.out.println(r.equals(s)); 

    }

}
