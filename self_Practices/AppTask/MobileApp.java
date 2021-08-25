package AppTask;

public class MobileApp {

    private String name;
    private String version;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getVersion(){
        return version;
    }
    public void setVersion(String version){
        this.version = version;
    }

    public MobileApp( String name, String version){
       setName(name);
         setVersion(version);
    }

public void useTheApp(int minutes){
    System.out.println("App " + name + " is used for " + minutes + " minutes.");

}
public void download(){
    System.out.println("Download function in progress");
}

public String toString(){
        return " Name of the object - " + name+
                ", version of the App - " + version;
}







}
