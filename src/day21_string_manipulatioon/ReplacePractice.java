package day21_string_manipulatioon;

public class ReplacePractice {
    public static void main(String[] args) {
        // String methods:
        // - equals()
        // - equalsIgnoreCase()
        // - length()
        // - toLowerCase()
        // - toUpperCase()
        // - contains()
        // - startsWith()
        // - endsWith()
        // - isEmpty()
        // - replace()

        // Java class methods -> are behaviour of the class, action, normally used to process the data
        String word = "github";
        System.out.println(word.toUpperCase());
        System.out.println(word.replace("hub","lAB"));
        System.out.println(word);

        word = word.replace("hub","lab");
        System.out.println(word);
        
        // gitlab
        // i -> o, a -> i --> gotlib
        System.out.println(word.replace('i','o').replace('a','i'));
        
        String sentence = "java is fun";
        String withNoSpace = sentence.replace(" ","");
        System.out.println("withNoSpace = " + withNoSpace);

        //"java" -> "selenium", "fun" -> "a lot of fun"

        sentence = sentence.replace("java","selenium").replace("fun","a lot of fun");
        System.out.println(sentence);

        String result = "1 - 48 of over 4,000 results for java book";
        result = result.replace("1 - 48 of over","")
                       .replace(",","")
                       .replace("results for java book","");

        System.out.println("result = " + result);

        // int count = Integer.parseInt(result);
        // count++;
        // if(count>0){
        //   System.out.println("search success");
        // }

    }
}
