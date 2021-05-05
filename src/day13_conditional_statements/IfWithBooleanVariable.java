package day13_conditional_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = true;
        if (isHungry == true) {
            System.out.println("I'm hungry. I'll go out to grab something to eat");
        } else {
            System.out.println("I'm not hungry. I'll keep coding java.");
        }


        double price = 130.44;
        boolean isAffordable = price <= 200;
        System.out.println("isAffordable = " + isAffordable);
        if (isAffordable == true) {
            System.out.println("I can afford it. Let's buy it!");
        } else {
            System.out.println("I cannot afford it. Let's keep coding java!");

        }

        boolean isRemoteJob = true;
        if (isRemoteJob == true) {
            System.out.println("Sure I am interested, what is the interview process?");
        } else {
            System.out.println("Sorry I am not interested");
        }

    }
}

// IF STATEMENT WITH STRING
// ...
// We can doo equals comparison.
// There is 2 ways we can compare string if it is equal something:
// 1) Using == operator
//      String city = "Fairfax";
//      if(city == "Fairfax'){
//          print " it is Fairfax";

// 2) Using equals() method/function
//      String city = "Los Angeles";
//      if(city.equals("Los Angeles")) {
//         print "it is LA"
//      }else{
//         print "it is not LA"
//      }


