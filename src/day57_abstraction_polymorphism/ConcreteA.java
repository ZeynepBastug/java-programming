package day57_abstraction_polymorphism;

public class ConcreteA extends AbstractA implements InterfaceA, InterfaceB{
    @Override
    public void absMethod() {
        System.out.println("absMethod implementation is called");
    }

    @Override
    public void methodB() {
        super.methodB();
    }

    // @Override - static methods are hidden
    public static void staticMethodC(){
        System.out.println("staticMethodC hidden version is called");
    }

    @Override
    public void absMethodD(int num) {

    }
}
