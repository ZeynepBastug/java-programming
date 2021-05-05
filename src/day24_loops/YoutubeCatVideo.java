package day24_loops;

public class YoutubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("World's smallest cat - BBC");
        int seconds = 0;
        int videoSeconds = 117;
        while (seconds <= videoSeconds && seconds >=0){
            System.out.println("Watching Youtube video at second: " + seconds);
            seconds++;
            Thread.sleep(1000);  //it make run in slow motion :))
        }
        System.out.println("Finished watching Cat video, let's start another one");

        // In the loop, we need to update our variable, so that condition becomes false, we can use ++ or --
        // ++ to count forward
        // -- to count backwards

    }
}
