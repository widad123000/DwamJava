package tp1;

import java.util.Scanner;

public class Saise2 {
    
    static public void main(String args[]) {
    // Partie Déclaration
    Scanner clavier = new Scanner(System.in);
    int age;
    String nom;
    double taille;

    // Partie lecture de données
    System.out.print("Quelle est votre nom?: ");
    nom = clavier.nextLine();
    System.out.print("Quelle est votre age?: ");
    age = clavier.nextInt();
    System.out.print("Quelle est votre taille?: ");
    taille = clavier.nextDouble();

    // Partie sortie des résultats
    System.out.println("Bonjour "+nom);
    System.out.print("Vous avez "+age+" ans");
    System.out.println(" et vous mesurez "+taille+" mètres");
    }

}
