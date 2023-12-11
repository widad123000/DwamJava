package tpn1;
import java.util.*;

public class exempla1 {
	public static void main(String[] args) {
		Calendar rightNow = Calendar.getInstance();
		System.out.println(rightNow);
			rightNow.set(Calendar.DAY_OF_YEAR, 2016);
			rightNow.set(Calendar.FEBRUARY, 28);
			rightNow.add(Calendar.DAY_OF_MONTH, 1);

			int j = rightNow.get(Calendar.DAY_OF_MONTH);
			int m = rightNow.get(Calendar.MONTH);
			int y = rightNow.get(Calendar.YEAR);
			
			Calendar cal2019=Calendar.getInstance();
			cal2019.set(Calendar.DAY_OF_YEAR, 2019);
			cal2019.set(Calendar.FEBRUARY,28 );
			
			int jour2019=cal2019.get(Calendar.DAY_OF_MONTH);
			int mois2019=cal2019.get(Calendar.MONTH);
			String jour=" ";

			if(jour=="29" && m==Calendar.FEBRUARY) {
				  System.out.println("Le lendemain du 28 Février 2016 est 29 Février 2016.");
	        } else {
	            System.out.println("Le lendemain du 28 Février 2016 n'est pas 29 Février aannée bissextile).");
	        }
			
			if(jour2019==1 && mois2019==Calendar.MARCH) {
				 System.out.println("Le lendemain du 28 Février 2019 est 1er Mars 2019.");
	        } else {
	            System.out.println("Le lendemain du 28 Février 2019 n'est pas 1er Mars 2019.");
	        }
	    
			

			
			System.out.println("On est le :"+j+"/"+(m+1)+"/"+y);
			switch(rightNow.get(Calendar.DAY_OF_WEEK)) {
			case 1 : jour = "Dimanche" ; break ;
			case 2 : jour = "Lundi" ; break ;
			case 3 : jour ="Mardi" ;break;
			case 4 : jour ="Mercredi" ; break ;
			case 5 : jour="Juedi";break;
			case 6 : jour="Vendredi";break;
			case 7 : jour="Samedi";break;
			}
			System.out.println("On est le :"+ jour +","+ j +"/"+ (m+1)+"/"+y);
			System.out.println("On est le :"+ jour +","+ j +"/"+ (m+1)+"/"+y);
		
			 Integer I ;
			 I=Integer.valueOf("123"); //string vers integer 
			 
			 int i ;
			 i = Integer.parseInt("456"); //string vers int 
			 
			 i=I.intValue();  //Integer vers int 
			 
			/* Integer I = new Integer (i); (par constructeur)*/
			 
			 i = 34 ;
			 //integer ou int  vers String
			 String s;
			 s = String.valueOf(i); // s devient "34"
			 
			 I=345 ;
			 s=I.toString();
			 System.out.println(s); // s devient "345"
			 
			 
			
			 Integer J=0;
			 I=10 ;
			 i= I.compareTo(J); //0 si I=j negatif si I<
			 System.out.println(i);
			 
			 
			 float f = 12.34f; //float vers Float
			 String v ;
			 Float F;
			 F= Float.valueOf("12.34") ;//String vers Float 
			 
			 f=Float.parseFloat("12.34");//String vers float
			 f=F.floatValue(); // Float vers float 
			 
			 v=F.toString() ; //de Float vers String 
			 
			 v=String .valueOf(f); //float vers String 
			 
			 
			
			
	}
}
