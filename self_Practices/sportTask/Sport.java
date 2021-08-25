package sportTask;

public class Sport {
    private int numberOfPlayers;
    private int numberOfRefere;
    private String rules;

    public Sport (int numberOfPlayers, int numberOfRefere, String rules){
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfRefere = numberOfRefere;
        play();
        toString();

    }
    public void play(){
        System.out.println("sport is good for everyone");
    }

    public String toString(){
        return  "Sport{"+
            "Number of players"+ numberOfPlayers+
                    "Number of referee" + numberOfRefere + "}";

        }
    }







