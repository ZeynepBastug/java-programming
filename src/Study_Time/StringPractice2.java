package Study_Time;

import java.util.*;

public class StringPractice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 1

        String firstName = "Zeynep";
        String lastName = "Bastug";
        System.out.println(firstName.substring(1));
        System.out.println(lastName.replace("B",""));

        // 2

        String str = "Hello_World.";
        if(str.length()%2 == 0){
            System.out.println(str.substring(str.length()/2-1, str.length()/2+1));
        }else{
            System.out.println(str.substring(str.length()/2,str.length()/2+1));
        }

        // 3

        String name = "james bond";
        int index = name.indexOf(" ");
        String initials = name.substring(0,1).toUpperCase() + name.substring(index+1, index+2).toUpperCase();
        System.out.println(initials);

        // 4

        String sentence = "Java is a fun language";
        int index1 = sentence.indexOf(" ");
        System.out.println(sentence.substring(index1+1) + " " + sentence.substring(0,index1));

        //5

        String sms = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programming and problem solving}";
        int index2 = sms.indexOf("<");
        int index3 = sms.indexOf(">");

        System.out.println("Sender: " + sms.substring(index2+1, index3));

        index2 = sms.indexOf("[");
        index3 = sms.indexOf("]");

        System.out.println("Number: " + sms.substring(index2+1, index3));

        index2 = sms.indexOf("{");
        index3 = sms.indexOf("}");
        System.out.println("Message: " + sms.substring(index2+1, index3));

        // 6

        System.out.println("Enter 2 words: ");
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        if (str1.length() >= 6 && str2.length() >= 6) {
            String email = str1.substring(0,4).toLowerCase() + str2.substring(str2.length()-3,str2.length()).toLowerCase();
            System.out.println(email.concat("@cybertek.com"));
        } else {
            System.out.println("Invalid data");
        }




    }
}
