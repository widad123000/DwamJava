import java.util.*;
class TestCalendar {
    static public void main(String args[]) {


        Calendar rightNow = Calendar.getInstance();
        System.out.println(rightNow);
        ;
        int j = rightNow.get(Calendar.DAY_OF_MONTH);
        int m = rightNow.get (Calendar.MONTH);
        int y = rightNow.get (Calendar.YEAR);
        rightNow.set(Calendar.MONTH, Calendar.MAY);
        rightNow.set(Calendar.DAY_OF_MONTH, 28);
        rightNow.add (Calendar.DAY_OF_MONTH, 1);
        System.out.println("On est le:"+j+ "/" +(m+1)+"/"+y);

        String jour ="";
        switch(rightNow.get(Calendar.DAY_OF_WEEK)){
            case 1: jour = "Dimanche"; break;
            case 2: jour = "Lundi"; break;
            case 3: jour = "Mardi";break;
            case 4: jour = "Mercredi";break;
            case 5: jour = "Jaudi";break;
            case 6: jour = "Vendredi";break;
            case 7: jour = "Samedi"; break;
        }
        System.out.printf("On est le: %s %d/%d/%d%n", jour, j, m+1, y);


        }
}