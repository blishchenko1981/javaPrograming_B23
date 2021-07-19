public class ShortHand {
    public static void main (String[] args ){
        int a = 234; // - 234 + 236- 236* 235%3
                     // 2-2
        int b = -a++ + ++a - a-- * a-- %3;

        int c = 55460%3;
        System.out.println("c = " + c);
        System.out.println("b = " + b);

        int d = c++ - b + --a + ++c * a%5;
              // 2  - 0 + 234+ 4* 234%5;
               // 2 + 234 +1 = 237;

            int w= 4*234%5 ;
        System.out.println("d = " + d);
        System.out.println("w = " + w);
        System.out.println("a = " + a);

        System.out.println("===================================");











    }



}
