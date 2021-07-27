public class Unit2 {
    public static void main(String[] args) {

    String s = "I will find the lost book";

    do{
        System.out.print(s.charAt(0));
        s= s.substring(3);
    }while (!s.isEmpty());


    }
}
