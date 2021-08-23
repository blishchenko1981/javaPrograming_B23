package OOP.bookTask;

public class main {
    public static void main(String[] args) {

        AudioBook audioBook = new AudioBook("Robinson Cruso", "Adnentures", "Defo", 23, 35, 34);
        System.out.println(audioBook);
        audioBook.listen();

        EBook eBook = new EBook("adge", "drame", "Bonne ", 21, 45, 564);
        System.out.println(eBook);
        eBook.readBook();



    }
}
