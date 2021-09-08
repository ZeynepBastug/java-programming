package Repl;

import java.util.*;

public class sinavDeneme {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        sinav pm = new sinav(in.nextInt());
        pm.add(in.nextInt());
        pm.tick();
        System.out.println(pm.timeLeft);
        System.out.println(pm.isExpired());

    }

}
