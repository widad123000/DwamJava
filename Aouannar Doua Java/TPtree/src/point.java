
public class point extends Object implements MonApi {
private int x;
private int y ;
//point(){

	//this.x=0;
	//this.y=0;
//	this (0,0);
//}
point(int x , int y){
	this.x=x;
	this.y=y;
}
public point(int a) {
    this.x = a; 
    this.y = 0; 
}
//public point(int a) {
//	this();
//	this.x=x;
	
//}
public point() {
    this(0); 
}

public int getX() {
	return this.x;
}
public void setX(int x) {
	this.x=x;
}
public int getY() {
	return this.y;
}
public void setY(int y) {
	this.y = y;
}

public point deplace(int axe) {
	    this.x = this.x + axe;
	    this.y = this.y + axe;

	    return this;
	}
	



public void reset() {
	x=0;
	y=0;
}

 public double distance (point b) {
	 return Math.sqrt(Math.pow((b.x - this.x), 2) + Math.pow((b.y - this.y), 2));
 }
 public static double distance (point a, point b) {
	 return  Math.sqrt(Math.pow((b.x - a.x), 2) + Math.pow((b.y - a.y), 2));
 }
 public boolean equals1(Object o) {
	 return (this.x == ((point)o).x &&this.y == ((point)o).y ) ;
			 

 }
 public boolean equals2(Object o) {
	 point p = new point(1,2);
	 return  (((point)o).x == p.x && ((point)o).y == p.y);
 }
 public String toString(){
	 return "("+x+","+y+")";
 }
public void print() {
	System.out.printf("(%d %d)\n",x,y);
	
}
public String ConvText() {
	String s = "{x:"+x+",y:"+y+"}";
	return s;
}
public int Compare(Object o) {
	point p = (point)o;
	if(this.x>p.x && this.y>p.y) {
		return 1;
	}else if(this.x<p.x && this.y<p.y) {
		return -1;
	}else {
	return 0;
	}
}
}
