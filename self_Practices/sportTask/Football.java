package sportTask;

public class Football extends Sport{
    private final int numberOfGoals;

    public Football(String name, int numberOfGoals, int numberOfPlayers, int numberOfRefers, String rules){
        super(name,numberOfPlayers,numberOfRefers,rules);
        this.numberOfGoals = numberOfGoals;
    }
    @Override
    public void play(){
        System.out.println("In "+ getName() + "player has to use feet only to score the ball into the goal");
    }



}
