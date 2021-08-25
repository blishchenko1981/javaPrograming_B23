package AppTask;

public class AppObject {
    public static void main(String[] args) {

        Discord discord = new Discord("5.1");
        discord.chat("Jim");
        discord.download();
        discord.getVersion();
        System.out.println(discord);

        System.out.println("----------------------------------");

        Instagram instagram = new Instagram("8.34");
        instagram.postPhoto();
        instagram.download();
        instagram.useTheApp(5);
        System.out.println(instagram);



    }
}
