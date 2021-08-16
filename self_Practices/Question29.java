import java.util.ArrayList;
import java.util.Scanner;

public class Question29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        int run = in.nextInt();

        while (run>0){

            run--;
            switch (in.nextInt()){
                case 1 :
                    nums.add(1);
                case 5 :
                    nums.add(50);
                    break;
                case 4:
                    break;
                case  8 :
                    nums.remove(0);
                    break;
                case 10:
                case-1:
                case -42:
                    nums.add(1,0);
                    break;
                case 2:
                    nums.add(20_000);
                    break;
                default:nums.add(null);




            }




        }
        System.out.println(nums);

    }
}
