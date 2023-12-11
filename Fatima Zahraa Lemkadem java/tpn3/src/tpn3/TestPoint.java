package tpn3;

public class TestPoint {
	public static void main(String args[]) {
		Point A = new Point();
		A.setX(3);
		A.setY(4);
		System.out.println(A.getX());
		System.out.println(A.getY());
		
		Point q = new Point (2,5);
		System.out.println(q.toString()); 
		
		 System.out.println(A.equals(q));
	}
}
