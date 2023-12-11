
public class TestPoint {
	public int x, y;

	public static void main(String[] args) {
		
		point p = new point ();
		p.setX(3);
		p.setY(4);
		System.out.println(p.getX());
		System.out.println(p.getY());

       point p1 = new point(3,4);
       point p2 = new point(3,4);
       
       System.out.println(p1.distance(p2));
       System.out.println(p1.deplace(3));
       System.out.println(point.distance(p1,p2));
       
       System.out.println(p1.equals1(p2));
       System.out.println(new point(1,2).equals2(p1));
       
       point q = new point (2,5);
       System.out.println(q.toString()); 
       
       MonApi m = new point(1,2);
       m.print();
       m.ConvText();
      System.out.println(m.Compare(p2)); 
      
      point point = new point(1,2);
      
	}

}
