package day18_conditional_practice_string_intro;

public class ThreeNumbers {
    public static void main(String[] args) {
        int num1, num2, num3;
        num1 = 100;
        num2 = 100;
        num3 = 100;
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("Largest value: " + num1);
        }else if ( num2 >= num1 && num2 >= num3){
            System.out.println("Largest value: " + num2);
        }else
            System.out.println("Largest value: " + num3);

    }
}
