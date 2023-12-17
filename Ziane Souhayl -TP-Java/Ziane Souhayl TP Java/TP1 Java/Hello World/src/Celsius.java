import java.util.Scanner;

class Celc {
    static double c2f(int c){
        double f = 9./5 * c + 32;
        return f;
    }
};


class Celsius {

    static double c2f(int c){
        double f = 9./5 * c + 32;
        return f;
    }


    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        int  c = input.nextInt();

        double f = Celc.c2f(c);

        Celc obj = new Celc();
        f = obj.c2f (c) ;

    }


}
