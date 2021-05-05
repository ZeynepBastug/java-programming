package OfficeHours.Practice_03_03_21;

public class ConcatExample {
    public static void main(String[] args) {
        System.out.println("1" + "2" + "3"); //123
        System.out.println(1 + 2 + 3 );  //6
        System.out.println(1 + 2 + "3"); //33
        System.out.println("1" + 2 + 3); //123 cus rule left to right, which means others join first one status.
        System.out.println("1" + (2 + 3)); //15 cus order of operations (islem onceligi)


    }
}
