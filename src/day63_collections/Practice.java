package day63_collections;

import java.util.*;

public class Practice {
    public static void main(String[] args) {

        System.out.println(removeDuplicate("AAABBBCCCD"));
        System.out.println(SortEachPart("DC501GCCCA098911"));

        System.out.println(test("[(])"));
    }

    /**
     * Create a method that will accept a String and return a String with the duplicate instances of characters removed
     *
     * Ex:
     * input: "AAABBBCCCD"
     * output: "ABCD"
     */

    public static String removeDuplicate(String str){

        Set<String> cr = new LinkedHashSet<>(Arrays.asList(str.split("")));
        // return cr.toString().replace("[","").replace("]","").replace(",","");
        return String.join("",cr);
    }

    /**
     * Create a method that will take any String of letters nd numbers and sort each substring of numbers and sort each substring of numbers and letters.
     *
     * ex:
     * input: "DC501GCCCA098911"
     * output: "CD015ACCCG011899"
     */

    public static String SortEachPart(String str){

        List<String> listCh = new ArrayList<>();
        String sortedstr = "";

        // one way

        for (int i = 0; i < str.length()-1; i++) {
            listCh.add(str.charAt(i) + "");

            if(Character.isLetter(str.charAt(i))){

                if(Character.isDigit(str.charAt(i+1))){

                    Collections.sort(listCh);
                    sortedstr += String.join("",listCh);
                    listCh.clear();
                }
            } else if(Character.isDigit(str.charAt(i))){

                if(Character.isLetter(str.charAt(i+1))){

                    Collections.sort(listCh);
                    sortedstr += String.join("", listCh);
                    listCh.clear();
                }
            }
            if(str.length() - 1 == i +1){
                listCh.add(str.charAt(i + 1) + "");
                Collections.sort(listCh);
                sortedstr += String.join("",listCh);
                listCh.clear();
            }
        }

        System.out.println(sortedstr);

        sortedstr = "";


        for (int i = 0; i < str.length(); i++) {
            listCh.add(str.charAt(i) +"");
            boolean nextSubString = false;

            if(Character.isLetter(str.charAt(i))){

                if(i == str.length()-1 || Character.isDigit(str.charAt(i+1))){
                    nextSubString = true;
                }
            } else if(Character.isDigit(str.charAt(i))){
                if(i == str.length()-1 || Character.isLetter(i+1)){
                    nextSubString = true;
                }
            }

            if(nextSubString){
                Collections.sort(listCh);
                sortedstr += String.join("",listCh);
                listCh.clear();
            }

        }

        return sortedstr;
    }

    /**
     * Write a method that prints the frequency of each character from a String
     * Create a method that will accept a String and print out the frequency of every character in
     *
     * Hint: use maps to keep track of the frequency. Go through the String using only one loop
     * EX:
     * input: "apple"
     * output: a = 1
     *         p = 2
     *         l = 1
     *         e = 1
     */


    public static void mapFrequencyOFCharacter(String str){
        Map <Character,Integer> map = new LinkedHashMap<>();

        for (Character each : str.toCharArray()) {
            if(map.containsKey(each)){
                map.put(each, map.get(each)+1 );
            } else {
                map.put(each, 1);
            }
        }
    }

    int count = 0;

    public static void frequencyOfEachChar(String str){
        Map<Character, Integer> map = new LinkedHashMap<>();

        String box = "";
        for (int i = 0; i < str.length() ; i++) {

            char key = str.charAt(i);
            if(!map.containsKey(key)){
                map.put(key,0);
            }
            map.put(key,map.get(key)+1);
        }
    }


    /**
     * Create a method that will accept a String of Brackets. Determine if the brackets are balanced.
     * brackets are balanced if the closing bracket matches the opening one
     *
     * Hint: use HashMap for the bracket pairs and Stack to help keep track of which opening brackets have been seen and need to be
     *
     * EX:
     *     {([])} -> balanced
     *     {[(])} -> unbalanced
     *
     * Checking for paranthesis is the most  important task of a compiler
     *
     * EX:
     * input: "[()]{}{[()()]()}"
     * output: balanced
     *
     * input: "[(])"
     * output: unbalanced
     *
     */

    public static boolean test(String str){

        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map =  new HashMap<>();
        map.put('[',']');
        map.put('(',')');
        map.put('{','}');

        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);

            if(ch == '[' || ch == '(' || ch == '{'){
                stack.push(ch);
            }else if (ch == ']' || ch == ')' || ch == '}'){
                if(stack.isEmpty()){
                    return false;
                } else if(map.get(stack.pop()) != ch){
                    return false;
                }
            }
        }

        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
