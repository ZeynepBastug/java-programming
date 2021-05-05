package day19_class_vs_object_strings;

public class LoginTest {
    public static void main(String[] args){
        String expUserName = "cybertek";
        String expPassword = " Abc123";

        String userName = "CYBERTEK";
        String password = "Abc123";

        if (userName.equalsIgnoreCase("cybertek") && password.equals("Abc123")){
            System.out.println("Pass - user successfully logged in");
        } else {
            if(!userName.equalsIgnoreCase("cybertek")) {
                System.out.println("incorrect user name");
            }else if (!password.equals("Abc123")){
                System.out.println("incorrect password");
            }
        }




    }
}
