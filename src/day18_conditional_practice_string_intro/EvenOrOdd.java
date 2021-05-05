package day18_conditional_practice_string_intro;

public class EvenOrOdd {
    public static void main(String[] args) {

        // NUMBER IS DIVISIBLE BY ANOTHER NUMBER:
        // meaning:  There is no remainder when we divide
        // in java: how do we check if number is divisible by another number?
        // % -> remainder operator/modules can be used.
        // When a number is divisible by 2 then it is an EVEN number
        // EVEN = divisible by 2  (remainder = 0)
        // ODD = not divisible by 2 (reminder = 1)

        int num = 4;
        System.out.println(num % 2);
        System.out.println(num % 2 == 0);

        if(num % 2 == 0){
            System.out.println(num + " is even");
        }else {
            System.out.println(num + " is odd");
        }
    }
}



