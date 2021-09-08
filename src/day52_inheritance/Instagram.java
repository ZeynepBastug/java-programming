package day52_inheritance;

public class Instagram extends MobileApp{

    public void postPicture(){
        System.out.println("Posting a picture on Instagram");
    }

    @Override
    public void useTheApp(int minutes){
        // useTheApp(20);  -> ERROR: StackOverflowError
        super.useTheApp(minutes);
        System.out.println("Using Instagram app features");
        postPicture();
    }

    @Override
    protected boolean download(){
        return true;
    }
}
