package tp6.ma;
 
class Cellule extends Object implements Cloneable {
	// Doit implementer la méthode clone() de l'interface Clonable.
	// Methode qui fait le clonage.
	 // Donnees
	 int i = 0;
	 int[] t = {1, 2};
	 //public Cellule (Cellule x){ 
		// this.i = x.i;
		// for (int i=0; i<2; i++)
		// this.t[i]=x.t[i];
		//}
	 
	 // Méthodes
	 public Object clone(){
	 //try { Cellule tmp = (Cellule) super.clone(); 
				 // tmp.t = (int []) this.t.clone(); 
				 //clonage de this.t 
				 // return tmp; }

	 //catch (CloneNotSupportedException e){
		// throw new InternalError();}
		 Cellule tmp = new Cellule();//clonage a c++
		 tmp.i=i;
		 tmp.t = (int []) this.t.clone(); 
		//clonage de this.t 
		 return tmp;
		 } 
	 
	 
	 public void afficher() {
		 System.out.println(i +" "+ t[0]+" "+t[1]);}
	 public void changeMe(){
		 i = 10;
		 t[0] = 11;
		 t[1] = 12;
		}

}
