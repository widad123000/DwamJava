package tp3_et_p4;

class Rectangle {
	private Point hg, bd ; // Les coins haut à gauche
	// Rectangle droit
	public Rectangle(){
	hg = new Point();
	bd = new Point();
	}
	public Rectangle(Point h, Point b){
	hg = h;
	bd = b;
	}
	public void afficher(){
	System.out.println("hg ("+hg.getX()+ ","+hg.getY()+")");
	System.out.println("bd ("+bd.getX()+ ","+bd.getY()+")");	
	}
	public int surface(){
	int longueur = Math.abs((hg.getX()-bd.getX()));
	int largeur = Math.abs((hg.getY()-bd.getY()));
	return longueur*largeur;
	}
	public void zoom(int deltax, int deltay){
		hg.setX(hg.getX() + deltax);
        hg.setY(hg.getY() + deltay);

        bd.setX(bd.getX() + deltax);
        bd.setY(bd.getY() + deltay);
	}
	// autres méthodes...
	}


	
	

