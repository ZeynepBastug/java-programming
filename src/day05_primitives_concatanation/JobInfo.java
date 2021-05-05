package day05_primitives_concatanation;

public class JobInfo {
    public static void main(String[] args) {
        String title = "SDET";
        String company = "Google";
        String JobDescription = " Java programmer";
        double salary = 90.000;
        byte yearsOfExperience = 3;
        boolean hasBenefits = true;

        System.out.println("Job title is " + title);
        System.out.println("Company is " + company);
        System.out.println("Job Description is " + JobDescription);
        System.out.println("Annual salary is $" + salary);
        System.out.println("Years of Experience is " + yearsOfExperience);
        System.out.println("hasBenefits is " + hasBenefits);
    }
}