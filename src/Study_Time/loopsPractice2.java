package Study_Time;

import java.util.*;

public class loopsPractice2 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       boolean print = true;
       String word = "javascript";
       for(int i = 0; i <= word.length(); i++){
           if(word.charAt(i) == word.charAt(word.length()-1-i)){
               System.out.println(print);

           }
       }



    }
}
