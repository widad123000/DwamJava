interface A {
    void f();
    int x = 10;
    default void g() {
        System.out.println("Méthode g() par défaut");
    }
}

interface B {
    void f();
    int x = 20;
}

class C implements A,B {
    public void f() {
        System.out.println("Méthode f() de C");
    }
}