package practice06_23_21;

public class ForLoop_Intro {
    public static void main(String[] args) {

        // Print out Cybertek's characters ont by one ;


 int i =0;
        for ( i= 0  ; i< 10; i++ ){
        System.out.print(i);}

        System.out.println("out of loop");
        System.out.println(i);

        String name  = "Cybertek School";

        for ( i = 0 ; i <= name.length()-1; i++ ){
            System.out.print(name.charAt(i));
        }

        System.out.println();
        for ( i = name.length() - 1 ; i >= 0; i-- ) {
            System.out.print(name.charAt(i));

        }

        System.out.println("___________Continue and break __________________");

        // print all consonants


        for (i =0; i <name.length(); i++ ){

            if (name.charAt(i) == 'a'||name.charAt(i) == 'e'||name.charAt(i) == 'o'
            ||name.charAt(i) == 'u'||name.charAt(i) == 'i'){
                        continue;
            }System.out.print(name.charAt(i));
        }







    }
}
