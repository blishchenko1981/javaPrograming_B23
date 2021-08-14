package practiceOOP;

public class Calc {
    private String names;
    private int x, y, result;

   /* public Calc(){

        this.x = x;
        this.y = y;
    }

    */
    public void setX(int x){

        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }

    public int getResult(){

        return result;
    }
    public void plus(){

        result = x+y;
    }
    public void minus(){
        result = x-y;
    }


}
