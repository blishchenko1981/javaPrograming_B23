package loops;

public class UtopianTree {
    public static void main(String[] args) {
        int size = 0;
        int growth = 0;
        for (int i = 1; i <=10; i++) {
            if(i<=3){
                growth = 1; }
            else {
                growth = 2;}
                size += growth;
            System.out.println("year "+i+ " - growth "+growth+ "cm\n" +
                    "tree size: " + size+ "cm");
        }





    }
}
