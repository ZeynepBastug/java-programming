package day18_conditional_practice_string_intro;

public class AuthenticationTest {
    public static void main(String[] args) {
        int expLast4SSN = 7509;
        int expPinCode = 1234;

        int last4SSN = 7508;
        int pinCode = 1237;

        if (last4SSN == expLast4SSN) {
            System.out.println("Authentication successful");
        }else {
            System.out.println("Authentication unsuccessful");
            if (last4SSN != expLast4SSN) {
                System.out.println("Last 4 of SSN is incorrect");
            }
            if ( pinCode != expPinCode){
                System.out.println("Pin code does not match");
            }
        }




    }
}
