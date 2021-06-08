package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        count(10);
        // I need make sure the code i write is maintainable and reusable, by writing many custom methods with parameters for
        // different programming and automation purposes

        int end = 999;
        count(end);

        String word = "wooden spoon";
        count(word.length());

        printAge(1994);
        printAge(2000);

    }

    public static void count(int num){

        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    public static void printAge(int year){
        int today = 2021;
        int age = today - year;
        System.out.println("Birth year: " + year + " Age: " + age);
    }


}
