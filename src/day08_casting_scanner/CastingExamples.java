package day08_casting_scanner;

public class CastingExamples {
    public static void main(String[] args) {
        // CASTING:    ---Byte < Short < Int < Long < Float < Double -----
        // -> convert one primitive type into another
        // byte, short, int, long
        // float, double
        // char, boolean
        // When we assign one primitive data into different one, we need to convert it/cast it.
        // 2 types of CASTING:
        // # IMPLICIT CASTING -> Casting happens automatically when we assign small data type into larger one.
        //                       Ex: byte num1 = 10
        //                           short num2 = num1;
        //                       In above example we don't need paranthesis and casting it, because it is automatically happens, from small data type to larger.

        // # EXPLICIT CASTING -> We need to use paranthesis and specify what primitive type we want to cast/convert.
        //                       Ex: int number1 = 55;
        //                           byte number2 = (byte)number1;


        byte num1 = 99;
        short num2 = num1;
        int num3 = num2;
        long num4 = num3;
        System.out.println("num4 = " + num4);

        float num5 = 124.4F;
        double num6 = num5;
        System.out.println(num6);

        int num7 = 3456;
        double num8 = num7;
        System.out.println(num7);
        System.out.println("num8 = " + num8);

        int num10 = 22;
        byte num11 = (byte)num10;
        short num12 = (short)num10;
        System.out.println("num10 = " + num10);
        System.out.println("num11 = " + num11);
        System.out.println("num12 = " + num12);

        double num13 = 55.3;
        float num14 = (float)num13;
        System.out.println("num13 = " + num13);
        System.out.println("num14 = " + num14);
        double num15 = 1234.5;
        int num16 = (int)num15;
        System.out.println("num16 = " + num16);
        
        int num17 = 300;
        byte num18 = (byte)num17;
        System.out.println("num18 = " + num18);
        
        char letter = 'M';
        int numLetter = letter;
        System.out.println("letter " + letter);
        System.out.println("numLetter = " + numLetter);


    }

}
