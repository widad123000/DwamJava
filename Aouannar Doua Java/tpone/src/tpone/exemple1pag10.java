package tpone;
import java.util.*;
public class exemple1pag10 {

	public static void main(String[] args) {
		Calendar rightNow = Calendar.getInstance();//pour travailler avec les dates et les heures
		System.out.println(rightNow);
		//rightNow.set(Calendar.MONTH, Calendar.MAY);//change month a may
		//rightNow.set(Calendar.DAY_OF_MONTH, 28);//change day 23 vers 28
		//rightNow.add(Calendar.DAY_OF_MONTH, 1);//calcule la date de lendemain
		rightNow.set(Calendar.DAY_OF_YEAR, 2016);
		rightNow.set(Calendar.FEBRUARY, 28);
		rightNow.add(Calendar.DAY_OF_MONTH, 1);
		
		int jour=rightNow.get(Calendar.DAY_OF_MONTH);
		int mois=rightNow.get(Calendar.MONTH);
		
		Calendar cal2019=Calendar.getInstance();
		cal2019.set(Calendar.DAY_OF_YEAR, 2019);
		cal2019.set(Calendar.FEBRUARY,28 );
		
		int jour2019=cal2019.get(Calendar.DAY_OF_MONTH);
		int mois2019=cal2019.get(Calendar.MONTH);
		
		
		if(jour==29 && mois==Calendar.FEBRUARY) {
			  System.out.println("Le lendemain du 28 Février 2016 est 29 Février 2016.");
        } else {
            System.out.println("Le lendemain du 28 Février 2016 n'est pas 29 Février aannée bissextile).");
        }
		
		if(jour2019==1 && mois2019==Calendar.MARCH) {
			 System.out.println("Le lendemain du 28 Février 2019 est 1er Mars 2019.");
        } else {
            System.out.println("Le lendemain du 28 Février 2019 n'est pas 1er Mars 2019.");
        }
    
		
	
	
	        Calendar now = Calendar.getInstance();
	        int heureActuelle = now.get(Calendar.HOUR_OF_DAY);
	        int minuteActuelle = now.get(Calendar.MINUTE);

	        int minutesDepuisMinuit = heureActuelle * 60 + minuteActuelle;

	        System.out.println("Il s'est écoulé " + minutesDepuisMinuit + " minutes depuis minuit.");
}
		
		
	    //j=rightNow.get(Calendar.DAY_OF_MONTH);
		//int m = rightNow.get(Calendar.MONTH);
		//int y = rightNow.get(Calendar.YEAR);
		//System.out.println("on est le :"+j+"/"+(m+1)+"/"+y);
		
		
		
		//exe3
		//String jour="";
		//switch(rightNow.get(Calendar.DAY_OF_WEEK)) {
		//case 1:jour="Dimanche";break;
		//case 2:jour="lundi";break;
		//case 3:jour="Mardi";break;
		//case 4:jour="Mercredi";break;
		//case 5:jour="Jeudi";break;
		//case 6:jour="Vendredi";break;
		//case 7:jour="Samedi";break;
		//
		//}
		
		
		//System.out.println("on est le:"+jour+";"+j+";"+(m+1)+";"+y);
		
//	}

}
