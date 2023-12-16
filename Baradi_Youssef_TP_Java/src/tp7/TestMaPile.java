package tp7;

import java.util.Scanner;

public class TestMaPile {

    public static void main(String[] args) {

        MaPile maPile = new MaPile();
        Scanner scan = new Scanner(System.in);

        System.out.println("Entrez des caractères (terminez par '#') :");

        char caractere;
        do {
            caractere = scan.next().charAt(0);
            if (caractere != '#') {
                maPile.empiler(caractere);
            }
        } while (caractere != '#');

        System.out.println("Caractères en ordre inverse :");
        while (!maPile.vide()) {
            System.out.print(maPile.sommet() + " ");
            maPile.depiler();
        }

        System.out.println("\nPartie de stringBuilder: ");
        StringBuilder stack = new StringBuilder();

        System.out.println("Entrez des caractères (terminez par '#') :");

        do {
            caractere = scan.next().charAt(0);
            if (caractere != '#') {
                stack.append(caractere);
            }
        } while (caractere != '#');

        System.out.println(stack);

        scan.close();
    }
}
