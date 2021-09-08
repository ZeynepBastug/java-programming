package day53_inheritance.hiding;

public class Mobile extends Phone {
    String type = "Mobile Phone";

    // Method hiding, we are hiding use() static method
    public static void use(){
        System.out.println("using mobile phone");
    }

    public void text(){
        use();
        System.out.println("And sending a text message");
    }
}
