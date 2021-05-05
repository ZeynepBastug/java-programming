package day25_loops;

public class WhileHungry {
    public static void main(String[] args) {
        // while loop | do while loop | for loop: 1) for loop with iterator
        //                                        2) for each loop:
        //                                               works with collections
        // In programming:
        // while loop to read files line by line
        // read database records one at a time until the last one.
        // for simple game development we could use while loop/infinite loop

        // while(file.haNextLine()){
        //     String line = file.readline();
        // .....
        // }

        // Selenium automation:
        //     - While certain element is not visible, keep waiting.
        //     - While page is still loading, keep waiting for page to finish loading
        //     - While there is still next link, keep clicking
        // .......
        // Life:
        //     While you are hungry, keep eating

        boolean isHungry = true;
        int bananas = 0;
        int countToFull = 3;

        while (isHungry){
            bananas++;
            System.out.println("Eating bananas: " + bananas);
            if (bananas == countToFull){
                isHungry = false;
            }
        }
        System.out.println("Had enough bananas, lets get back to studying");
        bananas--;



    }
}
