

class  ExceptionFactNegatif  extends Throwable {};

class ExceptionFactSuperieur12 extends Throwable {};


public class desexception {
	public static void main(String[] args) {
		int n = -1;
        try {
            int f = fact(n);
            System.out.println(f);
        }
           
            catch (ExceptionFactNegatif e) {
            	 System.out.println("Valeur negative pour factorielle");
            	 e.printStackTrace();
            	 }
    }

    public static int fact(int x) throws ExceptionFactNegatif {
        if (x < 0)
            throw new ExceptionFactNegatif();
        else {
            int f = 1;
            for (int i = 1; i <= x; i++) {
                f *= i;
            }
            return f;
        }
    }
}
