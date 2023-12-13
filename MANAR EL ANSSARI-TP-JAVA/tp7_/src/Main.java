import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MaPile p=new MaPile();
        p.empiler('A');
        p.empiler('B');
        p.empiler('C');
        p.empiler('D');
        p.empiler('E');
        p.depiler();
        System.out.println(p);
        MaPile p1=new MaPile();
        char a;
        Scanner clavier=new Scanner(System.in);
        System.out.println("entrer un cactere (# pour sortir)");
        a=clavier.next().charAt(0);
        while(a!='#'){
            p1.empiler(a);
            Scanner clavier1=new Scanner(System.in);
            System.out.println("entrer un cactere (# pour sortir)");
            a=clavier1.next().charAt(0);

        }
        System.out.println(p1);




    }
}