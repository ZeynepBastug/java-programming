package day28_loops;

import java.util.*;

public class RandomPassport {
    public static void main(String[] args) {

        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";
        Random random = new Random(); // helps generate random number
        String password = "";

        for(int i = 1; i <= 8; i++) {
            int index = random.nextInt(source.length()); // random num 0 -70
            // System.out.println(random.nextInt(source.length()));
            System.out.print(source.charAt(index));


            // printing password in one line is a pretty common interview question !!
            password += source.charAt(index);
        }

        System.out.println("\nyour password = " + password);



    }
}
