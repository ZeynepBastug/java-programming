package day22_string_manipulation;

public class IndexOfExamples {
    public static void main(String[] args) {
        // charAt(index) vs indexOf(string)
        // they work differently:
        //         charAt reads a character at certain index
        //         indexOf searches for string and return index nmber

        //         charAt returns -> char (single character) at given position
        //         indexOf returns -> int (index/position number) for the string

        String tech = "java, html, css, selenium, testng, maven, cucumber";
        // first comma
        System.out.println(tech.indexOf(","));
        // last comma
        System.out.println(tech.lastIndexOf(","));
        // for middle one, we need a loop statement
        int indexOfJava = tech.indexOf("java");
        System.out.println("java is at index " +indexOfJava);

        int idxOfCss = tech.indexOf("css");
        System.out.println("css is at index " + idxOfCss);

        int indexOfCucumber = tech.indexOf("cucumber");
        System.out.println("cucumber is at index " + indexOfCucumber);

        int indexOfSql = tech.indexOf("sql");
        System.out.println("sql is at index " + indexOfSql);

        // tech contains "maven" ?

        if(tech.contains("maven")){
            System.out.println("maven is present");
        } else {
            System.out.println("maven iss not present");
        }

        if(tech.indexOf("maven") > -1){
            System.out.println("maven is present");
        } else {
            System.out.println("maven is not present");
        }



    }
}
