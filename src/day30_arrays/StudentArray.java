package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {
        String[] studentInfo = {"123456789", "Bastug", "Zeynep", "B22", "+1 (519) 500-4063"};
        System.out.println("student ID = " + studentInfo[0]);
        System.out.println("student first name = " + studentInfo[1]);
        System.out.println("student last name = " + studentInfo[2]);
        System.out.println("batch = " + studentInfo[3]);
        System.out.println("student number= " + studentInfo[4]);

        System.out.println("studentInfo length = " + studentInfo.length);


        String[] studentInfo2 = new String[5];
        studentInfo2[0] = "234567890";
        studentInfo2[1] = "Mike";
        studentInfo2[2] = "Bloomberg";
        studentInfo2[3] = "B22";
        studentInfo2[4] = "+1 (216) 500-2345";

        // check if studentInfo data array contains 5 items
        // true: PASS: data array has correct length
        // false: FAIL: data array has incorrect length
        if(studentInfo.length == 5) {
            System.out.println("PASS: data array has correct length");
        } else {
            System.out.println("FAIL: data array has incorrect length");
        }

        if(studentInfo == studentInfo2){
            System.out.println("PASS: data arrays length match");
        }else {
            System.out.println("FAIL: data arrays length mismatch");
        }

        System.out.println(studentInfo[1].toUpperCase() + " " + studentInfo[2].toUpperCase());


        String studentMobile = studentInfo[4];
        System.out.println(studentMobile.length());
        System.out.println(studentMobile.startsWith("+1 (519)"));









    }
}
