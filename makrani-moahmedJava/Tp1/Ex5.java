public class Ex5 {
   
        public static void main(String args[]) {
            int c = 25;
            double f = c2f(c);
            System.out.println("Temperature in Fahrenheit: " + f);
        }
    
        static double c2f(int c) {
            return 9.0 / 5 * c + 32;
        }
    
    
}
