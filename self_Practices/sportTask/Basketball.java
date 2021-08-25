package sportTask;

public class Basketball extends Sport{

    private final int numberOfLoops;


    public Basketball(String name, int numberOfLoops, int numberOfPlayers, int numberOfRefers, String rules){

        super(name,numberOfPlayers, numberOfRefers, rules);
        this.numberOfLoops = numberOfLoops;
        name = "basketball";
    }
@Override
    public void play(){
        System.out.println("In "+getName()+" you need to score by throwing the ball into the baskets loop");
    }



}
