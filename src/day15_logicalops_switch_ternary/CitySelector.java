package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Istanbul";

        if(city.equals("Istanbul") || city.equals("Ankara")){
            System.out.println("Willing to relocate to " + city);
        }else {
            System.out.println("Not considering - " +city);
        }
        String teacher = "Saim";
        // Saim OR Murodil -> it is a java class with Saim
        // otherwise -> Soft skill class with Nadir

        if(teacher.equals("Saim") || teacher.equals("Murodil")){

            System.out.println("It is a java class with " + teacher);

        }else {
            System.out.println("Soft skill class with " + teacher);

        }

        String company = "Google";
        double salary = 85_000.0;

        if(company.equals("Google") || salary >= 100_000.0) {
            System.out.println("Accepting offer from " + company);
        }else {
            System.out.println("Rejecting offer from " + company);
        }



    }
}
