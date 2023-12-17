class MaPile implements Pile {
    private StringBuilder pile;

    public MaPile() {
        pile = new StringBuilder();
    }

    @Override
    public void empiler(char c) {
        pile.append(c);
    }

    @Override
    public char sommet() {
        if (!vide()) {
            return pile.charAt(pile.length() - 1);
        } else {
            throw new IllegalStateException("La pile est vide");
        }
    }

    @Override
    public void depiler() {
        if (!vide()) {
            pile.deleteCharAt(pile.length() - 1);
        } else {
            throw new IllegalStateException("La pile est vide");
        }
    }

    @Override
    public boolean vide() {
        return pile.length() == 0;
    }

    @Override
    public boolean pleine() {
        return false;
    }

    public static void main(String[] args) {
        MaPile maPile = new MaPile();

        maPile.empiler('a');
        maPile.empiler('b');
        maPile.empiler('c');

        System.out.println("Sommet de la pile : " + maPile.sommet());

        while (!maPile.vide()) {
            System.out.println("Dépiler : " + maPile.sommet());
            maPile.depiler();
        }
    }
}