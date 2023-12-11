package tpone;

public class WRRAPERSpag12 {

	public static void main(String[] args) {
		 Integer I;
		 I=Integer.valueOf("123"); // string to integer
		 
		 int i ;
		 i=Integer.parseInt("456"); //string to int
			
		 i=I.intValue(); // Integer vers int 
		 
		 //Integer I =new Integer(i);//int vers Integer
		 
		 i = 24;
		 String s;
		 s = String .valueOf(i); //s devient "24"// int to string
		 
		 I=354;
		 s=I.toString(); //s devient "345"
		 System.out.println(s);
		 
		 Integer J=1; 
		 I=0;
		 i=I.compareTo(J); //0 si I=J
		 System.out.println(i);// i=1 si I>J  && i=-1 si j<I
		 
		  float f = 12.34f; 
		  //float F = new Float (F); // float vers Float
		  
		  String t;
		 Float F = Float.valueOf("12.34");//string vers Float
		 System.out.println(F);
		 
		 f =Float.parseFloat("12,34"); //string vers float
		 f=F.floatValue(); // float vers Float
		 String v;
		 v=F.toString();  // float vers Strring
		 
		 v=String.valueOf(f);//float vers string
		 s= String.valueOf(f); // de float vers String
		}
	
	}


