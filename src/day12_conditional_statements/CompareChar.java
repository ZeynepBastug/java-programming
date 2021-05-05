package day12_conditional_statements;
//  A > B -> A IS CONSIDERED SMALLER THAN B.
// THE EARLIER IT APPEARS IN ALPHABET, IT WILL BE SMALLER THAN LETTERS THAT APPEAR LATER IN alphabet.

public class CompareChar {
    public static void main(String[] args) {
        char letter1 = 'H';
        char letter2 = 'Z';
        System.out.println(letter1 == letter2);
        System.out.println(letter1 > letter2 );
        System.out.println(letter1 < letter2);

        char grade = 'A';
        boolean pass = grade <= 'D';
        System.out.println("Did you pass the exam ? - " + pass);




    }
}
