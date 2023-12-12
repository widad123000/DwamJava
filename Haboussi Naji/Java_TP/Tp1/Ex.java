    import java.util.Scanner;
    import java.util.Scanner;


 class Ex {
        public static void main(String args[]) {
            if (args.length != 0)
                System.out.println("Hello " + args[0]);
        }
    
    
}
//ex3

 class ex3 {


    public static void main(String args[]) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Donner entier: ");
        int n = clavier.nextInt();
        System.out.println(n * 2);
    
}

    
}
//ex4

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
//Ex5
public class Ex5 {
   
        public static void main(String args[]) {
            int c = 25;
            double f = c2f(c);
            System.out.println("Temperature in Fahrenheit: " + f);
        }
    
        static double c2f(int c) {
            return 9.0 / 5 * c + 32;
        }
    
    
}



