package Geometry;

public class rhombus extends Shape implements Paper {
    
   private int side;
   private final int angle;
   
   public int getSide(){
       return side;
   }
   public int getAngle(){
       return angle;
   }
   public void setSide(int side){
       if(side<= 0){
           
           throw new RuntimeException("Side can not be less then 0");
       }
   }
   
   
    
    public rhombus (int side , int angle){
    this.side = side;
    this.angle = angle;
    }
    
    public int  perimeter(){
        return side*4;
    }
    public int area(){
       return side*side;
    }

    @Override
    protected void color(String color) {
        System.out.println("This rhombus color is "+ color);
    }

    @Override
    public void quality() {
        System.out.println("this is a rhombus quality");
    }

    @Override
    public String toString() {
        return "rhombus{" +
                "side=" + side +
                ", angle=" + angle +
                ", perimeter=" + perimeter() +

                '}';
    }
}
