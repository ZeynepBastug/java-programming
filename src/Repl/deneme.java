package Repl;

import java.util.*;

public class deneme {
    public static void main(String[] args) {

        System.out.println(merge("abc", "defg"));

    }
    public static String merge (String one, String two){

        String word = "";

            if(one.length() >= two.length()){
                for (int i = 0; i < two.length(); i++) {
                    word += "" +one.charAt(i) + two.charAt(i);
                }
                word += one.substring(two.length());

            }else {
                for (int i = 0; i < one.length(); i++) {
                    word += "" + one.charAt(i) + two.charAt(i);
                }
                word += two.substring(one.length());
            }

        return word;
    }
}
