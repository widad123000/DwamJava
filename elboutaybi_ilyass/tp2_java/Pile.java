package org.tp2;

public class Pile {
    static final int MAX = 8;
    char[] t;
    int top;

    public Pile() {
        t = new char[MAX];
        top = -1;
    }

    public void empiler(char c) {
        if (!estPlein())
            t[++top] = c;
        else
            System.out.println("Pile pleine");
    }

    public char sommet() {
        return t[top];
    }

    public void depiler() {
        if (!estVide()) {
            char[] newPile = new char[MAX-1];
            System.arraycopy(t, 0, newPile, 0, MAX - 1);
            t = newPile;
        }
    }

    public boolean estVide() {
        return t[0] == '\0';
    }

    public boolean estPlein() {
        boolean isFull = true;
        for (int i = 0; i < t.length; i++) {
            if (t[i] == '\0') {
                isFull = false;
                break;
            }
        }
        return isFull;
    }
}
