package day32_arrays_split;

public class CountUsingSplit {
    public static void main(String[] args) {
        // COUNTING STRING OCCURRENCES IN STRING USING SPLIT:
        // Given below string, count how many "cat" is in String
        String cats = "bengal cat tabby cat persian cat no cat here";
        int count = 0;
        for(int i = 0; i < cats.length()- 2; i++){
            if(cats.substring(i, i+3).equals("cat")){
                count++;
            }
        }
        System.out.println("count of cats = " + count);


        int catNum = cats.split(" cat ").length - 1;
        System.out.println(catNum);

        String[] catsArray = cats.split("cat ");
        System.out.println("number of 'cat' = " + (catsArray.length - 1));

        for (String type : catsArray) {
            System.out.println(type);
        }




    }
}
