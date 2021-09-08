package day57_abstraction_polymorphism;

public abstract class AbstractA {

    int num1;
    private double price;
    public static int count;
    public final String type = "abstract";
    public static final String LANGUAGE = "java";

   //  private abstract void abdMethodA();
   //  public static abstract void absMethodJ();
   //  public final abstract void abdMethodQ();


    public AbstractA() {
        System.out.println("AbstractA constructer");
    }

    public abstract void absMethod();
    public void methodB(){
        System.out.println("methodB is called");
    }

    public static void staticMethodC(){
        System.out.println("static methodC is called");
    }
}
