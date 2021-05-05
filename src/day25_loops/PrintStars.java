package day25_loops;

public class PrintStars {
    public static void main(String[] args) {
        for(int i = 1; i <= 15; i++){
            System.out.print("\uD83C\uDF1F * ");
        }

        System.out.println();
        String myStars = "";
        for(int i = 0; i < 5; i++){
            myStars += "* ";
            System.out.println(myStars);

        }


    }
}
