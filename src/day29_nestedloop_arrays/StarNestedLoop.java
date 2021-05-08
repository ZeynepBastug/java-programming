package day29_nestedloop_arrays;

public class StarNestedLoop {
    public static void main(String[] args) {
        String star = "";
        for(int i = 1; i <= 5; i++){
            for( int n = 1; n <= i; n++){
                star += "* ";
                System.out.println(star);
            }
        }

        System.out.println();

        for(int i = 1; i <= 5; i++){
            for(int n = 1; n <= 10; n++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
