package tpn3;


public class Point {
	public int x ; 
	public int y ;
	 
	public Point() {
		this.x = 0 ;
		this.y = 0 ;
	}
	
	public Point(int x , int y) {
		this.x = x ; 
		this.y = y ; 
	}
	
	public void setX ( int x) {
		this.x=x;
	}
	
	public int getX() {
		return x ;
	}
	
	public void setY( int y ) {
		this.y = y ; 
	}
	public int getY () {
		return y ;
	}
	
	public void deplacer(int x_ , int y_) {
		this.x= x+x_;
		this.y=y+y_;
	}
	
	public void reset () {
		this.x = 0 ; 
		this.y = 0; 
	}
	public double distance(Point b) {
		int distX = this.x - b.getX();
		int distY = this.y - b.getY();
		return Math.sqrt(Math.pow(distX,2)+Math.pow(distY,2));
		
	}
	public double distance2(Point b , Point c) {
		int distX = b.getX()-c.getX();
		int distY = b.getY()-c.getY();
		return Math.sqrt(Math.pow(distX, 2)+Math.pow(distY, 2));
	}
	public boolean equals(Point a) {
		return(this.x == a.x && this.y == a.y);
	}
	
	public String toString() {
		return "("+x+","+y+")";
	}
	
	
	
}
