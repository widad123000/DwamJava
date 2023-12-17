
public class TestPile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MaPile pile = new MaPile();

        System.out.println("Entrez des caractères (terminer avec '#') :");

        char caractere;
        do {
            caractere = scanner.next().charAt(0);

            if (caractere != '#') {
                pile.empiler(caractere);
            }
        } while (caractere != '#');

        System.out.println("Caractères en ordre inverse :");

        while (!pile.estVide()) {
            System.out.print(pile.depiler());
        }

        scanner.close();
    }
}
