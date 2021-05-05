package day05_primitives_concatanation;

public class UsingVariables {
    public static void main(String[] args){
        int num1 = 100;
        int num2 = num1;
        System.out.println(num1);
        System.out.println(num2);

        num1 = 200;
        System.out.println(num1);

        int zeynepsZipCode = 22182;
        int hazelsZipCode = zeynepsZipCode;
        System.out.println(zeynepsZipCode);
        System.out.println(hazelsZipCode);

        zeynepsZipCode = 20007;
        System.out.println(zeynepsZipCode);
        System.out.println(hazelsZipCode);

        zeynepsZipCode = 33131;
        hazelsZipCode = 11555;
        System.out.println(zeynepsZipCode);
        System.out.println(hazelsZipCode);


    }
}
