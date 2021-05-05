package day37_methods_overloading;

import java. util.*;

public class WarmUpMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userName = scan.nextLine();
        String password = scan.nextLine();

        loginVoid(userName,password);
        loginVoid("cybertek", "answer");
        loginVoid("zeynep bastug","thy6789");

        System.out.println(login("cybertekStudent", "abc123"));
        if(login("cybertekStudent", "abc123")){
            System.out.println("Login successful, welcome to canvas");
        } else {
            System.out.println("Login failed");
        }
        boolean isLoginSuccess = login("nadir", "Mountain");
        System.out.println("isLoginSuccess = " + isLoginSuccess);
    }

    public static void loginVoid(String ID, String code){

        String secretUserName = "Hazel Bastug";
        String secretPassword = "3512+abt";

        if(secretPassword.equals(code) && secretUserName.equals(ID)){
            System.out.println("Login successful. Welcome to Cybertek School");
        } else {
            System.out.println("Incorrect password or user name. Please try again!");
        }
    }

    public static boolean login(String ID, String code) {
        String secretUserName = "nadir";
        String secretPassword = "mountain";

        // return secretPassword.equals(code) && secretUserName.equals(ID);

        if (secretPassword.equals(code) && secretUserName.equals(ID)) {
            return true;
        } else {
            return false;
        }

    }
}
