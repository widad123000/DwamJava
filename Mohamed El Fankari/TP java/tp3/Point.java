package testt;

public class Point {
	
	// Point.java

	/**
	 * Classe Point du plan avec ses coordonnées x et y
	 */
	
	    private int x, y;
	    public Point(int x,int y) {
			this.x=x;
			this.y=y;
}
	    /**
	     * Methode qui affecte la valeur de son paramètre au Point this.
	     */
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
	    public boolean equals(Point a){
	    	return (this.x == a.x &&
	    	this.y == a.y ) ;
	    	}
	}


