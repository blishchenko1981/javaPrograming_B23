package AppTask;

public class Discord extends MobileApp {

    public Discord( String version){
        super("Discord", version);
    }

    public void chat(String name){
        System.out.println("Chat with " + name);
    }



}
