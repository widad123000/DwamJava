public interface A {
    int a=3;
    void afficher();

    public default void g() {
        System.out.println("je suis g() de l'interface A");
    }
}
