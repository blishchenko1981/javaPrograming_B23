package day43_OOP_Encapsulation;

public class EncapsulationIntro {
    private String username= "Cybertek",
            password = "Cybertek123";


    public String getUsername(){// allows read the data outside the class
        return username;
    }
    public String getPassword(){
        return password;
    }
    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

}
