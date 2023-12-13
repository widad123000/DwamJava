public class C implements A,B{
    @Override
    public void afficher() {
        System.out.println(A.a);
    }
    public void g(){
        System.out.println("je suis g() redifinie dans main ");
    }
}
