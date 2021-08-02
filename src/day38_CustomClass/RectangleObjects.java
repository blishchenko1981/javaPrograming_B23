package day38_CustomClass;

public class RectangleObjects {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle();

        rec1.setInfo(20.0, 30.0);

        System.out.println("------------------------------------");
        Rectangle rec2 = new Rectangle();
        rec2.setInfo(50,10);


        System.out.println("-----------------------------------");

        System.out.println(rec1);
        System.out.println(rec2);

    }
}
