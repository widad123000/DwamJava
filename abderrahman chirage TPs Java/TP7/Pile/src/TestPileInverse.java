import java.util.Scanner;

public class TestPileInverse {
    public static void main(String[] args) {
        MaPile maPile = new MaPile();
        Scanner scanner = new Scanner(System.in);

        char caractere = scanner.next().charAt(0);


        while (caractere != '#') {
            maPile.empiler(caractere);
            caractere = scanner.next().charAt(0);
        }


        System.out.println("Caractères en ordre inverse : ");
        while (!maPile.vide()) {
            System.out.print(maPile.sommet());
            maPile.depiler();
        }

        scanner.close();
    }
}
