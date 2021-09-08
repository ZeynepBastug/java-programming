package day52_inheritance;

public class AppObjects {
    public static void main(String[] args) {
        MobileApp mobileApp = new MobileApp();
        mobileApp.setName("Youtube");
        mobileApp.useTheApp(10);

        Instagram instagram = new Instagram();
        instagram.setName("Instagram");
        instagram.setVersion("5_1");
        instagram.useTheApp(20);

        Discord discord = new Discord();
        discord.setName("Discord");
        discord.useTheApp(30);
        discord.download();
    }
}
