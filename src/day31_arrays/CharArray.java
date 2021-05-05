package day31_arrays;

public class CharArray {
    public static void main(String[] args) {
        char[] letters = { 'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};
        for(char charLetter : letters){
            System.out.print(charLetter + " ");
        }
        // When we have char array, we can create a String out of it. It will automatically join each letter into a single string

        // CONVERT CHAR ARRAY INTO STRING:
        // Just create a new String with char array in constructor
        System.out.println();
        String sentence = new String(letters);
        System.out.println(sentence);

        String item = "wooden spoon";
        char[] itemArray = item.toCharArray();
        System.out.println(itemArray);

        System.out.println("itemArray length " + itemArray.length);
        System.out.println("item length " + item.length());

        String[] fruits = {"banana", "mango", "watermelon", "orange", "strawberry", "blueberry"};

        String fruitStr = "";

        for(String each : fruits) {
            System.out.print(each + "-");
            fruitStr += each + "-";
        }

        System.out.println("\nfruitStr = " + fruitStr);

        String[] languages = {"java", "python", "c++", "sql", "ruby", "javascript"};

        System.out.println(String.join("|", languages));
        System.out.println(String.join(" ## ", languages));

        String joinedLanguages = String.join(" <> ", languages);
        System.out.println("joinedLanguages = " + joinedLanguages);


    }
}
