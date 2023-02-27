package Study_Time;

import java.util.Arrays;
import java.util.List;

public class J {
    public static void main(String[] args) {
        System.out.println(getString("aaaabbcccdda"));
    }
    //aaaabbcccdda==> a4b2c3d2a,

    public static String getString(String str){

        int count = 1;
        String newStr = "";
        for (int i = 0; i < str.length()-1 ; i++) {

            if(str.charAt(i)==str.charAt(i+1)){
                count++;
            } else{
                newStr += str.charAt(i) + "" + count;
                count = 1;
            }

        }
        newStr += str.charAt(str.length()-1);

        return newStr;


    }

    public static void getfruit(){

        List<String> fruits = Arrays.asList("a", "b","w","m","b","a","k","a","m","a");



    }

}
