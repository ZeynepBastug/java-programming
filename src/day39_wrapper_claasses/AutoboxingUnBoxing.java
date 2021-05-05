package day39_wrapper_claasses;

public class AutoboxingUnBoxing {
    public static void main(String[] args) {
        // AUTO-BOXING : primitive -> Wrapper class object
        // UNBOXING : Converting Wrapper class object -> primitive


        // AUTO-BOXING
        int num1 = 500;
        Integer num2 = num1;
        Integer num3 = 234;

        // What is the purpose of Wrapper classes:
        // ability to convert from primitive into object (wrapper class)


        // UN-BOXING
        Double d1 = new Double(100.5);
        double d2 = d1;
        double d3 = new Double (345.3);
    }
}
