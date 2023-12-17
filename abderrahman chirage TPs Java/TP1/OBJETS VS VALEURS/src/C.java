public class C {
    int x;
    public int getX(){return x;}
    public void setX(int p){x = p;}
    public static void main (String []args){
        C x = new C(), y = new C();
        x.setX(5);
        y.setX(6);
        System.out.println(x.getX() + " et " + y.getX());
        x = y;
        x.setX(4);
        System.out.println(x.getX() + " et " + y.getX());

    }
}