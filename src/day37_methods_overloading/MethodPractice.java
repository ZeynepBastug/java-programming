package day37_methods_overloading;

public class MethodPractice {
    public static void main(String[] args) {
        repeatString("java", 3, '|');

    }
    public static void repeatString(String word, int times, char delimiter){
        String returnValue ="";
        for (int i = 1; i <= times ; i++) {
            if(i == times){
                returnValue += word;
                break;
            }
            returnValue += word + delimiter ;
        }
        System.out.print(returnValue);




    }

}
