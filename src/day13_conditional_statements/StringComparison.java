package day13_conditional_statements;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Los Angeles";
        if (city.equals("Los Angeles")) {
            System.out.println(" It is LA");
        } else {
            System.out.println("It is not LA");
        }

        String weather = "sunny";
        // if(weather == "sunny") { <-- it works, not error, but AVOID
        if (weather.equals("sunny")) {
            System.out.println("the weather is sunny");
        } else {
            System.out.println("the weather is not sunny");
        }
    }
}
