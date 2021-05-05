package day13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {
        double bonus = 0;
        double salesAmount = 12200.55;
        if(salesAmount <= 1000){
            System.out.println("Good job, you qualified for bonus!");
            bonus += 50;

    }else{
            System.out.println("Great job, you qualified for full bonus");
            bonus +=100;

        }
        System.out.println("bonus = $" + bonus);
    }
}

    //  AUTO FORMAT SHORTCUT IN INTELLIJ:
    //  For MAC: