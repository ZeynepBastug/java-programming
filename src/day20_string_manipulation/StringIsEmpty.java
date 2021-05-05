package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {

        // isEmpty() -> checks if a string is empty "", returns boolean(true/false)
        // EX:
        //     String car = "lexus";
        //     System.out.println(car.isempty());  ->false

        //      String str = "";
        //      System.out.println(str.isempty());  ->true


        String jobTitle = "";
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.length());
        System.out.println(jobTitle.length() == 0);

        if(jobTitle.isEmpty()){
            System.out.println("JobTitle is missing, please resend");
        }else {
            System.out.println("Job title looks good");
        }

        if(jobTitle.length() == 0) {
            System.out.println("Job Title is empty");
        }else {
            System.out.println("Job title is not empty");
        }

        System.out.println(jobTitle.equals(""));

        if("".equals(jobTitle)) {
            System.out.println("Job title is empty");
        } else {
            System.out.println("Job title is not empty");
        }

        String word = " ";
        System.out.println(word.isEmpty());
        System.out.println(word.length());

        String veggie = "carrots";
        System.out.println(veggie.isEmpty());

        if(!veggie.isEmpty()) {
            System.out.println("we have " + veggie);
        }

        // 3 STEPS TO LEARN ANY METHOD:
        // 1) What does it accept:
        //      str.isEmpty();
        //      str.length();
        //      str.equals();
        //      -> some methods do not accept any inputs, some do.

        // 2) What does method do: logig/purpose of the method:
        //




    }

}
