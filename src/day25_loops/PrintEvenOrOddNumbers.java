package day25_loops;

public class  PrintEvenOrOddNumbers {
    public static void main(String[] args) {
        System.out.println("EVEN NUMBERS 0 - 100:");
        for(int i = 0; i <= 100; i +=2){
            System.out.print(i + " ");
        }

        System.out.println("\nODD NUMBERS 0 - 100:");
        for(int i = 1; i <= 99; i +=2){
            System.out.print(i + " ");
        }
    }
}
