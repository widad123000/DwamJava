import java.util.Scanner;

public class TestTaPileInverse {
    public static void main(String[] args) {
        TaPile taPile = new TaPile();
        Scanner scanner = new Scanner(System.in);

        char caractere = scanner.next().charAt(0);

        // Empile les caractères jusqu'à ce que '#' soit lu
        while (caractere != '#') {
            taPile.empiler(caractere);
            caractere = scanner.next().charAt(0);
        }

        // Dépile et imprime les caractères en ordre inverse
        System.out.println("Caractères en ordre inverse : ");
        while (!taPile.vide()) {
            System.out.print(taPile.sommet());
            taPile.depiler();
        }

        scanner.close();
    }
}
