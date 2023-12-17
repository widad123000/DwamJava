class TaPile implements Pile {
    private char[] tableau;
    private int sommet;

    public TaPile() {
        tableau = new char[MAX];
        sommet = -1;
    }

    @Override
    public void empiler(char c) {
        if (!pleine()) {
            sommet++;
            tableau[sommet] = c;
        } else {
            throw new IllegalStateException("La pile est pleine");
        }
    }

    @Override
    public char sommet() {
        if (!vide()) {
            return tableau[sommet];
        } else {
            throw new IllegalStateException("La pile est vide");
        }
    }

    @Override
    public void depiler() {
        if (!vide()) {
            sommet--;
        } else {
            throw new IllegalStateException("La pile est vide");
        }
    }

    @Override
    public boolean vide() {
        return sommet == -1;
    }

    @Override
    public boolean pleine() {
        return sommet == MAX - 1;
    }

    public static void main(String[] args) {
        TaPile taPile = new TaPile();
        taPile.empiler('a');
        taPile.empiler('b');
        taPile.empiler('c');

        System.out.println("Sommet de la pile : " + taPile.sommet());

        while (!taPile.vide()) {
            System.out.println("Dépiler : " + taPile.sommet());
            taPile.depiler();
        }
    }
}
