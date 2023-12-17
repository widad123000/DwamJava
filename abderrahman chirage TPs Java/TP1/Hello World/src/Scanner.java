import java.util.Scanner;
class scanner {
    static public void main(String args[]) {
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


        System.out.format("Bonjour %s %nVous avez %d ans", nom, age);
                System.out.format(" et vous mesurez %f mètres %n", taille);

    }
};
