
class Test extends Object {
    static public void main(String args[]){
        int x = 2;
        System.out.println("Avant modif, x = " + x);
        modifVal(x);
        System.out.println("Apres modif, x = " + x);

        int [] t = {2, 3};
        System.out.println("Avant modif, t[0] = " + t[0]);
                modifObj(t);
        System.out.println("Apres modif, t[0] =  " + t[0]);

        C o = new C();
        o.setX(100);
        modifObj(o);
        System.out.println(o.getX());
    }

    public static void modifObj(int p[]) {
        p = new int [] {200, 300, 400};
    }

    public static void modifVal(int x) {
        x = x + 200;
    }
    public static void modifObj(C p) {
        p.setX(p.getX() + 200);
    }

}
