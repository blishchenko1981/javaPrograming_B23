package sportTask;

public class Sport {
    private String name;
    private int numberOfPlayers;
    private int numberOfRefere;
    private String rules;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getNumberOfRefere(){
        return numberOfRefere;
    }

    public void setNumberOfRefere(int numberOfRefere){
        this.numberOfRefere = numberOfRefere;
    }

    public String getRules(){
        return rules;
    }
    public void setRules(String rules){
        this.rules = rules;
    }
    public Sport (String name, int numberOfPlayers, int numberOfRefere, String rules){
        setName(name);
        setNumberOfRefere(numberOfRefere);
        setNumberOfPlayers(numberOfPlayers);
        setRules(rules);
        play();
        toString();

    }
    public void play(){
        System.out.println("sport is good for everyone");
    }

    public String toString(){
        return  "Sport{ "+ name+
            " //Number of players "+ numberOfPlayers+
                    " //Number of referee " + numberOfRefere +
                " //rules: " + rules+" }";

        }
    }







