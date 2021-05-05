package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital One";
        System.out.println(company.contains("i"));
        System.out.println(company.contains(" O"));
        System.out.println(company.contains("l O"));

        if(company.contains(" ")){
            System.out.println("Multiple words company names");
        } else {
            System.out.println("Single word company name");
        }

        String firstName = "Nadir";
        if(firstName.contains("a") || firstName.contains("i")){
            System.out.println("a or i is present");
        }else {
            System.out.println("not a or i is present");
        }

        String email = "zeynepBstg@hotmail.com";
        //Check if email "@" and ends with ".com
        if(email.contains("@") && email.contains(".com")){
            System.out.println("Valid email");
        }else {
            System.out.println("invalid email");
        }
        // CASE insensitive contains
        // Goes from left to right. First convert to lower case, then check if b is present.
        if(email.toLowerCase().contains("b")){
            System.out.println("b is present");
        }


    }
}


