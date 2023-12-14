public class Cellule implements  Cloneable{
	 int i=0 ; 
	 int [] table= {1,2};
	public Cellule clone()
	{
		try {
		return (Cellule)super.clone();
		
		/*Cellule tmp=(Cellule)super.clone();
		
			/* Cellule tmp=new Cellule();
			 tmp.i=i;
			for( int i=0 ; i<2 ; i++)
			tmp.table[i]=table[i];
		 return tmp;*/
		
		}
		catch(CloneNotSupportedException e )
		{
		 throw new InternalError(" l'operation de clonage n'est pas terminé");
		}
		
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