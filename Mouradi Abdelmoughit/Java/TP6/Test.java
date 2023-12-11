package TP6;

public class Test implements  Cloneable{
	 int i=0 ; 
	 int [] table= {1,2};
	public Cellule clone()
	{
		
			 Cellule tmp=new Cellule();
			 tmp.i=i;
			for( int i=0 ; i<2 ; i++)
			tmp.table[i]=table[i];
		 return tmp;
		
		
	
	}
	 public void afficher()
	 {
		 System.out.println(i+" "+table[0]+" "+table[1]);
		 }

	
	public void changeMe()
	{
		i=11; 
		 table[0]=5; 
		 table[1]=10; 
	}
	
	
	public static void main(String[] args) {
		  Cellule c= new Cellule();
		  c.afficher();
		  Cellule c1=c.clone();
		  c1.afficher();

		  c.changeMe();
		  c.afficher();

		  c1.afficher();
		

	}

}