package sportTask;

public class GameON {

    public static void main(String[] args) {


        Basketball basketball = new Basketball
                ("basketball", 2, 6, 3, "Throw the ball into the basket");
        System.out.println(basketball);
        System.out.println();
        Football game2 = new Football("football",2,11,3,"Put the ball in the goal");
        System.out.println(game2);


    }
}
