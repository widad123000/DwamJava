package tp1;

import java.util.Calendar;

public class Date {
    public static void main(String[] args) {

        /*Scanner clavier = new Scanner(System.in);
        int age;
        String nom;
        double taille;

        // Partie lecture de données
        System.out.print("Quelle est votre nom?: ");
        nom = clavier.nextLine();
        System.out.print("Quelle est votre age?: ");
        age = clavier.nextInt();
        System.out.print("Quelle est votre taille?: ");
        taille = clavier.nextDouble();*/

        // Partie sortie des résultats

        /*System.out.println("Bonjour "+nom);
        System.out.print("Vous avez "+age+" ans");
        System.out.println(" et vous mesurez "+taille+" mètres");*/

        //System.out.format("Bonjour %s vous avez %d ans, vous mesurez %.2f metres" ,nom, age, taille);

        /*//Class Calendar
        Calendar rightNow1 = Calendar.getInstance();

        System.out.println(rightNow1);*/

        Calendar rightNow1 = Calendar.getInstance();
        int j = rightNow1.get(Calendar.DAY_OF_MONTH);
        int m = rightNow1.get (Calendar.MONTH);
        int y = rightNow1.get (Calendar.YEAR);

        System.out.println("On est le:"+j+ "/"+(m+1)+"/"+y);
    }
}