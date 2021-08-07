import java.util.Scanner;

public class MergeString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        String c = "";
        if(a.length()<= 3 && a.length()>0 || b.length()<= 3 && b.length()>0) {

            for (int i = 0; i <a.length(); i++) {

                c += a.charAt(i);
                c += b.charAt(i);
            }
        }

        System.out.println(c);



    }
}
