package OOP.bookTask;

public class main {
    public static void main(String[] args) {

        AudioBook audioBook = new AudioBook("Robinson Cruso", "Adventures", "Daniel Defo", 23, 35, 34);
        System.out.println(audioBook);
        audioBook.listen();

        EBook eBook = new EBook("Age", "drama", "Bonnet Stone ", 21, 45, 564);
        System.out.println(eBook);

        eBook.getPages();



    }
}
