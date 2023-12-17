package tp6;

class Cellule implements Cloneable {

	// Doit implementer la méthode clone() de l'interface Clonable.
	// Methode qui fait le clonage.
	 // Donnees
	 int i = 0;
	 int[] t = {1, 2};
	 
	 // Méthodes
	/*public Object clone(){
	 try {
	 return super.clone();
	 }
	 catch (CloneNotSupportedException 
	e){
	 throw new InternalError();
	 } 
	 }*/
	 public Object clone(){
		 try {
		 Cellule tmp = (Cellule) 
		super.clone(); 
		 tmp.t = (int []) this.t.clone(); 
		//clonage de this.t 
		 return tmp;
		 }
		 catch (CloneNotSupportedException 
		e)
		 {throw new InternalError(); }
		}
	 public Cellule () {
		 i=0;
		 for (int i=0; i<2; i++)
			 t[i]=0;
	 }
	 public Cellule (Cellule x){ 
		 this.i = x.i;
		 for (int i=0; i<2; i++)
		 this.t[i]=x.t[i];
		}

	 public void changeMe(){
		 i = 10;
		 t[0] = 11;
		
		 t[1] = 12;
		}
	 public void afficher(){
	 System.out.println(i +"( "+ t[0]+", "+t[1]+")");
	 }
}
