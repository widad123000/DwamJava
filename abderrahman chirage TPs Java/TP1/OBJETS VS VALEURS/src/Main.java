public class Main {
    public static void main(String[] args) {

        int x = 1, y;
        y = x;
        System.out.println("Avant (x = 100): x = " + x + " , y = " + y);
        x = 100;
        System.out.println("Après (x = 100): x = " + x + " mais y = " + y);
        int[] u = {4, 5};
        int[] v;
        v = u;
        System.out.println("Avant (u[0] = 100): u[0] = " + u[0] + " , v[0] = " + v[0]);
        u[0] = 100;
        System.out.println("Après (u[0] = 100): u[0] = " + u[0] + " ET v[0] = " + v[0]);




    }
}