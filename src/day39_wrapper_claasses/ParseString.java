package day39_wrapper_claasses;

public class ParseString {
    public static void main(String[] args) {
        // IQ: how do you convert String into number?
        // We can use parse or valueOf methods in wrapper classes.

        // String -> int
        String total = "345";
        int count = Integer.parseInt(total);
        System.out.println("count = " + count);
        int num = Integer.parseInt("55");
        System.out.println("num = " + num);

        String strPrice = "123.5";
        double price = Double.parseDouble(strPrice);
        if(price > 100){
            System.out.println("expensive");
        }
        
        
        String sentence = "I wrote 100 lines of code";
        String[] words = sentence.split(" ");
        int linesOfCode = Integer.parseInt(words[2]);
        System.out.println("linesOfCode = " + linesOfCode);

        int num12 = 1001;
        Integer n = num12;
        System.out.println(n);
        String num13 = n.toString();
    }
}
