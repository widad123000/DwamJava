package tp3;

	
	 public class Point extends Object{
	  private int x, y;
	  public Point(){this (0,0);}//constructeur defaut
	  public Point(int x, int y) {//constructeur
		super();
		this.x = x;
		this.y = y;
	}
	public void setX(int p) {
	  x = p;
	  }
	  public void setY(int p) {
	  y = p;
	  }
	  public int getX() {
	  return x;
	  }
	  public int getY() {
	  return y;
	  }
	  public void  Déplacer(int L){//déplacer un point d'une longueur sur l'axe des x et des y
		  this.x+=L;
		  this.y+=L;
	  }
	  public void reset() { // ramener un point à l'origine par une méthode reset()
		  this.x=0;
		  this.y=0;
	  }
	  public double distance (Point b) {// calcule la distance entre le point this et le point b en paramètre
		  double dx = this.x - b.x;
	        double dy = this.y - b.y;
	        return Math.sqrt(dx * dx + dy * dy); 
	  }
	  public static double distancedeuxpoints (Point a,  Point b) {//calcule la distance entre les points a et b en paramètres
		  double dx = a.x - b.x;
	       double dy = a.y - b.y;
	       return Math.sqrt(dx * dx + dy * dy); 
	  }
	  /*public boolean equals(Object o) {//permet de tester «l'égalité» entre deux objets
		  if (this==o)return true;
		  else return false;
	  }
	  public boolean equals(Point a){//Surcharger la méthode equals
		  return (this.x==a.x && this.y==a.y);
		 }*/
	 public  boolean equals(Object a){
		  return (this.x == ((Point)a).x &&
		 this.y == ((Point)a).y ) ;
		 }
	  public String toString() {//pour convertir un objet Point vers une chaîne de caractères imprimable
		  return "(" + x + "," + y + ")" ; 
		 }
	  
	 };


