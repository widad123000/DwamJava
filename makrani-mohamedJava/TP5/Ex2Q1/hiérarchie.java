abstract class AbstractA {
    abstract public void methodA();
}

abstract class AbstractB extends AbstractA {
    abstract public void methodB();
}

class ConcreteC extends AbstractB {
    public void methodA() {
        System.out.println("Implementation de methodA dans ConcreteC");
    }

    public void methodB() {
        System.out.println("Implementation de methodB dans ConcreteC");
    }
}
