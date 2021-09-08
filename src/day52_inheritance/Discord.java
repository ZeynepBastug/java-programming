package day52_inheritance;

public class Discord extends MobileApp{

    public void chat(String someone){
        System.out.println("Chatting with " + someone + " on Discord");
    }

    @Override
    public void useTheApp(int minutes){
        super.useTheApp(minutes);
        chat("Vladislav");

    }

    @Override
    protected boolean download(){
        System.out.println("Discord is downloading " + getVersion());
         return super.download();
    }
}
