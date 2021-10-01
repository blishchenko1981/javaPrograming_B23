import java.util.ArrayList;

public class SwapTwoNums {


    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a;
        a= b;
        b = c;
        System.out.println("a= "+a + ", b= " + b);

        a=a+b;
        b= a-b;
        a= a-b;
        System.out.println("a= "+a + ", b= " + b);

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(a);
        nums.add(b);
        a = nums.get(1);
        b = nums.get(0);
        System.out.println("a= "+a + ", b= " + b);









    }

}
