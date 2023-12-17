public class MaPile {
    private StringBuilder stack;

    public MaPile() {
        stack = new StringBuilder();
    }

    public void empiler(char c) {
        stack.append(c);
    }

    public char depiler() {
        if (!estVide()) {
            char c = stack.charAt(stack.length() - 1);
            stack.deleteCharAt(stack.length() - 1);
            return c;
        } else {
            throw new IllegalStateException("La pile est vide");
        }
    }

    public boolean estVide() {
        return stack.length() == 0;
    }
}
