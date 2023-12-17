    import java.util.Scanner;

public class Ex4 {


    public static void main(String args[]) {
        Scanner clavier = new Scanner(System.in);
        int age;
        String nom;
        double taille;

        System.out.print("Quelle est votre nom?: ");
        nom = clavier.nextLine();
        System.out.print("Quelle est votre age?: ");
        age = clavier.nextInt();
        System.out.print("Quelle est votre taille?: ");
        taille = clavier.nextDouble();

        System.out.println("Bonjour " + nom);
        System.out.print("Vous avez " + age + " ans");
        System.out.println(" et vous mesurez " + taille + " mètres");
    }


}
