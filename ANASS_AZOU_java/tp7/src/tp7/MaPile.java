package tp7;
import java.util.Scanner;


public class MaPile implements Pile {
    private int top;
    private StringBuilder s;

    public MaPile(int max) {
        s = new StringBuilder(max);
        top = -1;
    }

    @Override
    public void empiler(char c) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the index: ");
        int i = scan.nextInt();
        if (i >= 0 && i <= top + 1) {
            s.insert(i, c);
            top++;
        } else {
            System.out.println("Invalid index for empiler operation.");
        }
    }

    @Override
    public char sommet() {
        if (vide()) {
            throw new IllegalStateException("La pile est vide.");
        }
        return s.charAt(top);
    }

    @Override
    public void depiler() {
        if (vide()) {
            System.out.println("La pile est vide. Impossible de dépiler.");
        } else {
            s.deleteCharAt(top);
            top--;
        }
    }

    @Override
    public boolean pleine() {
        return top == s.length() - 1;
    }
    
    @Override
   public boolean vide() {
	   return top == -1 ;
   }


}
