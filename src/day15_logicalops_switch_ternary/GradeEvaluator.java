package day15_logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade = 'B';

        if(grade == 'A' || grade == 'B' || grade == 'C'){
            System.out.println(" Passed with Grade " + grade);

        }else if ( grade == 'D'){
            System.out.println("Quality for retake " + grade);
        }else if ( grade == 'E'){
            System.out.println("Failed");
        }else
            System.out.println("Invalid Grade" + grade);

    }
}
