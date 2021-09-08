package day55_abstraction.interface_demo;

public interface MyInterface {
    public abstract void learn();
}

interface MyInterface2{

}
class MyClass implements MyInterface, MyInterface2{
    @Override
    public void learn() {

    }
}

class Main{
    public static void main(String[] args) {
        // MyInterface myInterface = new MyInteface(); -> ERROR: cannot create object of interface
        MyClass myClass = new MyClass();

    }

}