package day23_Arrays;

public class MyClassmates {
    public static void main(String[] args) {
        //initializing the size of the array
        // DataType[] variableName = new DataType[size]

        String[] friends = {"Sabir", "Vitalii", "Ksenia", "Atilla"};
        System.out.println("size"+ friends.length);
        for (int i = 0; i <=friends.length-1 ; i++) {
            System.out.println(friends[i]);
        }

        System.out.println("=========================================");

        // if we don't know what are the elements but know how many elements we are wanna store
        String [] friends2 = new String[4];
        System.out.println("Size"+ friends2.length);

        friends2[friends.length-1] = "Camel";
        friends2[2] = "Vitalii";
        friends2[1] = "Ksenia";
        friends2[0] = "Sabir";
        //friends2[4]  = "sdf"//  cant work Arrays size if fixed 4>friend.length

        for (int i = 0; i <= friends2.length-1 ; i++) {
            System.out.println(friends2[i]);

        }






    }
}
