public class Exercise3 {
    public static void main(String[] args){
        
        System.out.println("EXERCISE 3: \n");
        try{
            Pile stack3 = new Pile();
            char topchar = stack3.sommet();
            System.out.println(topchar);
        } catch (ExceptionPileUnderflow e){
            System.out.println("An exception occurred: " + e.getMessage());
        }
    }
}
