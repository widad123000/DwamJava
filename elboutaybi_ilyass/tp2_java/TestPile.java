package org.tp2;

import java.util.Scanner;

public class TestPile {


    public static void main(String[] args) {
        char monChar;
        Scanner scanner = new Scanner(System.in);
        Pile p = new Pile();
        char c = scanner.next().charAt(0);

        while (c != '#') {
            p.empiler(c);
            c = scanner.next().charAt(0);
        }

        while (!p.estVide()) {
            c = p.sommet();
            System.out.print(c + " ");
            p.depiler();
        }
    }
}
