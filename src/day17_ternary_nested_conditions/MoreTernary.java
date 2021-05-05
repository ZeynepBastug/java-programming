package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;
        String reply = (hourlyRate > 45) ? "accept" : "reject";
        System.out.println("reply = " + reply);

        String todayClass = "java";

        String teacher = todayClass.equals("java") ? "Murodil" : "Nadir";
        System.out.println("Today's teacher = " + teacher);

        boolean isEligibleToDrive = true;
        String driving = isEligibleToDrive ? "yes, have DL, can drive" : "no, don't have DL, can't drive";
        System.out.println(isEligibleToDrive);

        // NESTED IF STATEMENT:
        // We can put if statement inside IF statement. That is called NESTED IF statement.

        // if(condition1) {
        //    if(condition2){
        //         code A
        //    } else {
        //         code B
        //    }
        // } else {
        //    if(condition3) {
        //         code C
        //    } else {
        //         code D
        //    }
        // }


    }
}
