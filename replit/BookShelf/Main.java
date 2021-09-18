package BookShelf;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book(11, "ARTHEur Cody", "Frogs", 3);
        Book book2 = new Book(12, "Agata Kristy", "9 africans", 345);
        Book book3 = new Book(13, "Janny Rodary", "Chippolino", 213);
        Book book4 = new Book(14, "Ilf Ilya", "12 chears", 234);
        Book book5 = new Book(15, "Erquel Puaro", "Smog", 332);
        Book book6 = new Book(16, "Donald Trump", "How I screw democracy", 1);
        Book book7 = new Book(17, "Vladimir Putin", "What is Democracy, Donald?", 2);
        Book book8 = new Book(18, "Fransua McRoan", "Sher she la fam", 2343);

        System.out.println("Shelf.isShelfEmpty() = " + Shelf.isShelfEmpty());
        Shelf.addBook(book1);
        Shelf.addBook(book2);
        Shelf.addBook(book3);
        Shelf.addBook(book4);
        Shelf.addBook(book5);
        Shelf.addBook(book6);
        Shelf.addBook(book7);
        Shelf.addBook(book8);
        System.out.println("Shelf.isShelfEmpty() = " + Shelf.isShelfEmpty());

        System.out.println(Shelf.getTheBooks());

        System.out.println("Shelf.getTitleByID(11) = " + Shelf.getTitleByID(11));

        Shelf.removeBook(12);
        Shelf.removeBook("ARTHEur Cody");
        System.out.println("Shelf.getTheBooks().size() = " + Shelf.getTheBooks().size());
        System.out.println("Shelf.getAllBooksForAuthor(\"Fransua McRoan\") = " + Shelf.getAllBooksForAuthor("Fransua McRoan"));

        System.out.println("Shelf.findBookByPartialTitle(\"Sm\").getAuthor() = " + Shelf.findBookByPartialTitle("Sm").getAuthor());


        Shelf.clearBookShelf();
        System.out.println("Shelf.getTheBooks().size() = " + Shelf.getTheBooks().size());
    }
}
