package day53_inheritance.final_keyword;

public class Runner {
    public static void main(String[] args) {
        System.out.println(TestData.ADMIN_USERNAME);
        // TestData.ADMIN_PASSWORD = "change"; -> ERROR: cannot change value of final variable

    }
}
