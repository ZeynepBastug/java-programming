package day15_logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location = "in Ontario";
        double salary = 90_000.0;
        boolean remote = true;
        boolean benefits = true;

        if(salary >= 70.000 && location.equals("in Ontario") && remote && benefits) {
            System.out.println(" I'll accept the offer right away");


        }else{
            System.out.println("i'll think about it.");


        }



    }
}
