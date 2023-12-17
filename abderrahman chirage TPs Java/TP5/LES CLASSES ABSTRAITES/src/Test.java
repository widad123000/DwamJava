class Test{
    static public void main(String args[]){
        Speciale1 s1 = new Speciale1();
        s1.moi();
        s1.qui();
        s1.x++;
        System.out.println(s1.x);

        Speciale2 s2 = new Speciale2();
        s2.moi();
        s2.qui();
        s2.specialMoi();
        s2.x++;
        System.out.println(s2.x);
    }
}
