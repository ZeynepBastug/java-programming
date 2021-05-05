package day35_methods_with_param;

import java.util.*;

public class Email {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = scan.nextLine();
        System.out.println("Enter the domain:");
        String domain = scan.nextLine();
        buildEmail(name, domain);


    }

    public static void buildEmail(String eName, String eDomain){

        String email = eName + "@" + eDomain + ".com";

        System.out.println(email.replace(" ", "_").toLowerCase());
    }
}
