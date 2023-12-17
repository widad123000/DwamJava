public class Cellule implements Cloneable {
    private int i;
    private int[] t;


    public Cellule(int i, int[] t) {
        this.i = i;
        this.t = t;
    }

    public Object clone() {
        Cellule tmp = new Cellule();
        tmp.i = this.i;
        tmp.t = new int[this.t.length];
        
        for (int j = 0; j < this.t.length; j++) {
            tmp.t[j] = this.t[j];
        }

        return tmp;
    }

    public static void main(String[] args) {

        Cellule cellule1 = new Cellule(42, new int[]{1, 2, 3});
        Cellule cellule2 = (Cellule) cellule1.clone();

        System.out.println("Cellule 1 : " + cellule1.i + ", " + Arrays.toString(cellule1.t));
        System.out.println("Cellule 2 : " + cellule2.i + ", " + Arrays.toString(cellule2.t));
    }
}
