package tp3_et_p4;

public class Point extends Object {
	private int x,y;
	
	public Point(int a, int b){x = a; y = b;}
	
	public Point(){x = 0; y = 0;} 
	
	public Point(int a){this.x = a; y = 0;} 
	/*public Point(int a){this.y = a; x = 0;} */
	
	/*public Point() {
		this(0);
	}*/
	
	public void setX(int p) {
		x=p;
	}
	
	public void setY(int p) {
		y=p;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		 return y;
		 }
	public void deplacer(int longueur) {
		this.x= x + longueur;
		this.y= y + longueur;
	}
	public void reset() {
		x = 0;
		y = 0;
	}
	public double distance (Point b) {
		double deltax = this.x - b.getX();
		double deltay= this.y - b.getY();
		return Math.sqrt(Math.pow(deltax, 2)+Math.pow(deltay, 2));
	}
	public static double distance (Point a, Point b) {
		double deltax = a.getX() - b.getX();
		double deltay = a.getX() - b.getY();
		return Math.sqrt(Math.pow(deltax, 2)+Math.pow(deltay, 2));
	} 
	public boolean equals(Point a){
		 return (this.x==a.x && this.y==a.y);
		}
	 public boolean equals(Object a) {
		 
		 return (this.x == ((Point)a).x && this.y == ((Point)a).y ) ;
	 }
	 public String toString() {
		 return "(" + x + "," + y + ")" ; 
		}
	

}
