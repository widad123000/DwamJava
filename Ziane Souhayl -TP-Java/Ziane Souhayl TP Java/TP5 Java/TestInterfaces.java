class TestInterfaces {
    public static void main(String[] args) {
        C c = new C();
        c.f();

        A a = new C();
        a.f(); 

        C c = new C();
        c.f(); 
        A a = new C();
        a.f();


        interface AWithG extends A {
            default void g() {
                System.out.println("Méthode g() dans A");
            }
        }
        interface AJava8 {
            void f();

            default void g() {
                System.out.println("Méthode g() dans A (Java 8 et ultérieur)");
            }
        }
    }
}
