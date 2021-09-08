package day54_abstraction;

public abstract class MyAbstractClass {

    int num = 55;
    public void learn(){
        System.out.println("Learning... ");
    }

    public abstract void close();

}

class Sub extends MyAbstractClass { //concrete class

    public void close(){
        System.out.println("Close - abstract method implementation");
    }

}

class MyObject{
    public static void main(String[] args) {
        // MyAbstractClass mac = new MyAbstractClass();  -> abstract classes meant to be extended to sub classes
        Sub sub = new Sub();
        sub.learn();
        sub.num = 13;
        System.out.println(sub.num);

    }




}
