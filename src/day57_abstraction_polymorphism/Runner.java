package day57_abstraction_polymorphism;

public class Runner {
    public static void main(String[] args) {
        // AbstractA absA = new AbstractA(); - ERROR
        // InterfaceA iA = new InterfaceA(); - ERROR

        InterfaceA.staticMethodE("wooden spoon");
        // ConcreteA.staticMethodE("hellp"); -> staticMethodE only works with interface.staticMethodE
        ConcreteA.staticMethodC();
    }
}
