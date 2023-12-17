package tp3_et_p4;

class test {

	public static void main(String[] args) {
		 Point p = new Point(); 
		 p.setX (3);
		 p.setY (4);
		 System.out.println( p.getX() );
		 System.out.println( p.getY() ); 
		 
		 
		 
		 Object j = new Point(); 
		 ((Point) j).setX (3);
		 ((Point) j).setY (4);
		 System.out.println( j.equals(p) );
		 
		 Point q = p; 
		 q.setX (3);
		 q.setY (4);
		 System.out.println( q.equals(p) );
		 
		 Point u = new Point(5,2);

		 System.out.println(u.toString()); // imprime (2,5)
		 Point M= new Point(1,3);
		 Point N= new Point(9,5);
		 Rectangle MN= new Rectangle(M, N);
		 System.out.println(MN.surface());
		 
}

}
